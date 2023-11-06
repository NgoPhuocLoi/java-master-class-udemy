package threads;

// Thread state
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        try {
            System.out.println("Main thread paused for 1 second");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        Thread thread = new Thread(() -> {
            String tname = Thread.currentThread().getName();
            System.out.println(tname + " should take 10 dots to run");

            for (int i = 0; i < 10; i++) {
                System.out.print(". ");
                try {
                    Thread.sleep(500);
                    System.out.println("State 1: " + Thread.currentThread().getState());
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("\nWhoops! %s is interrupted!".formatted(tname));
                    System.out.println("State 2: " + Thread.currentThread().getState());
                    return;
                }
            }

            System.out.println("\n" + tname + " completed!");
        });

        System.out.println(thread.getName() + " starting");
        thread.start();
        System.out.println("Main thread should continue here.");

        long now = System.currentTimeMillis();

        while (thread.isAlive()) {
            System.out.println("Waiting for the thread to complete!");
            try {
                Thread.sleep(1000);
                System.out.println("State 3: " + thread.getState());
                if (System.currentTimeMillis() - now > 2000) {
                    thread.interrupt();
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }

        }

        System.out.println("State 4: " + thread.getState());

    }
}
