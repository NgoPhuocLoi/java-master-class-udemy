package executorService;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        var redExecutor = Executors.newSingleThreadExecutor(new ColorThreadFactory(ThreadColor.RED));
        var yellowExecutor = Executors.newSingleThreadExecutor(new ColorThreadFactory(ThreadColor.YELLOW));
        var blueExecutor = Executors.newSingleThreadExecutor(new ColorThreadFactory(ThreadColor.BLUE));

        redExecutor.execute(Main::countDown);
        redExecutor.shutdown();
        boolean isDone = false;
        try {
            isDone = redExecutor.awaitTermination(500, TimeUnit.MILLISECONDS);

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (isDone) {
            yellowExecutor.execute(Main::countDown);
            yellowExecutor.shutdown();

            try {
                isDone = yellowExecutor.awaitTermination(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            if (isDone) {
                blueExecutor.execute(Main::countDown);
                blueExecutor.shutdown();
            }
        }

    }

    public static void countDown() {
        String tname = Thread.currentThread().getName();
        ThreadColor threadColor = ThreadColor.RESET;

        try {
            threadColor = ThreadColor.valueOf(tname);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }

        String color = threadColor.color();
        for (int i = 20; i >= 0; i--) {
            System.out.println("%s%s: i = %d".formatted(color, tname, i));
        }
    }
}
