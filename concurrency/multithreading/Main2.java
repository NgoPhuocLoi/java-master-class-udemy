package multithreading;

// Memmory consistency errors
public class Main2 {
    public static void main(String[] args) {
        CachedData data = new CachedData();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            data.toggleFlag();

            System.out.println("Flag in writer: " + data.isReady());
        });

        Thread readThread = new Thread(() -> {
            while (!data.isReady()) {
                // waiting until flag becomes true
            }

            System.out.println("Flag in read: " + data.isReady());
        });

        writerThread.start();
        readThread.start();
        ;
    }
}
