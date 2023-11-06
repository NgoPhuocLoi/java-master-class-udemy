package threads;

// Running thread
public class Main3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            String tname = Thread.currentThread().getName();
            System.out.println(tname + " should take 10 dots to run");

            for (int i = 0; i < 10; i++) {
                System.out.print(". ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    System.out.println("\nWhoops! %s is interrupted!".formatted(tname));
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("\n %s is completed!".formatted(tname));
        });

        Thread installationThread = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {

                try {
                    Thread.sleep(500);
                    System.out.println("Installation step " + i + " is completed!");
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                    return;
                }
            }
        });

        Thread monitorThread = new Thread(() -> {
            long now = System.currentTimeMillis();

            while (thread.isAlive()) {
                try {
                    Thread.sleep(1000);

                    if (System.currentTimeMillis() - now > 2000) {
                        thread.interrupt();
                    }

                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });
        thread.start();
        monitorThread.start();

        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        if (!thread.isInterrupted()) {
            installationThread.start();
        } else {
            System.out.println(thread.getName() + " is interrupted!");
        }
    }
}
