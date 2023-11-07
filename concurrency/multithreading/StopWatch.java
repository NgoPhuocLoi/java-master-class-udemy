package multithreading;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    private TimeUnit timeUnit;
    private int i;

    public StopWatch(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void countDown() {
        countDown(5);
    }

    public void countDown(int count) {
        String tname = Thread.currentThread().getName();

        ThreadColor threadColor = ThreadColor.RESET;

        try {
            threadColor = ThreadColor.valueOf(tname);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        String color = threadColor.color();

        for (i = count; i > 0; i--) {
            try {
                timeUnit.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
                // TODO: handle exception
            }
            System.out.println("%s%s: i = %d".formatted(color, tname, i));
        }
    }
}
