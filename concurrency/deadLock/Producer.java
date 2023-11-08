package deadLock;

import java.util.Random;

public class Producer implements Runnable {
    private final String MESS = """
            You get dignity,
            When you stop thinking wrong
            When you do what you learn right
            You can live dignified,
            When you live a lifestyle that,
            matches your vision.
            You can get dignit
            when you renounce the “ego of individuality”.
            and rejoice ups and downs of life.
            There is dignity,
            when you have good thoughts,
            in your heart and mind.
            """;

    MessageRepo messageRepo;

    public Producer(MessageRepo mr) {
        this.messageRepo = mr;
    }

    @Override
    public void run() {
        String[] messages = MESS.split("\n");
        Random random = new Random();
        for (String message : messages) {
            messageRepo.write(message);
            try {
                Thread.sleep(random.nextInt(500, 2000));

            } catch (Exception e) {
                throw new RuntimeException();
                // TODO: handle exception
            }
        }
        messageRepo.write("Finished");
    }
}
