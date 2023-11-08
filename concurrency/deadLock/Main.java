package deadLock;

public class Main {
    public static void main(String[] args) {
        MessageRepo messageRepo = new MessageRepo();

        Thread reader = new Thread(new Comsumer(messageRepo));
        Thread writer = new Thread(new Producer(messageRepo));

        reader.start();
        writer.start();
    }
}
