package deadLock;

import java.util.Random;

public class Comsumer implements Runnable {

    MessageRepo messageRepo;

    public Comsumer(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @Override
    public void run() {
        Random random = new Random();
        String lastMsg = "";
        do {
            try {
                Thread.sleep(random.nextInt(500, 1000));
                lastMsg = messageRepo.read();
                System.out.println(lastMsg);
            } catch (Exception e) {
                throw new RuntimeException();
                // TODO: handle exception
            }
        } while (!lastMsg.equals("Finished"));
    }

}
