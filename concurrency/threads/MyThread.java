package threads;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.print("1 ");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // TODO: handle exception
            }
        }
    }
}
