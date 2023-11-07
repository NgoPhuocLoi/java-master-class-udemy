package multithreading;

import java.util.concurrent.TimeUnit;

// Using shared object for multiple threads
public class Main {
    public static void main(String[] args) {
        // StopWatch stopWatch = new StopWatch(TimeUnit.SECONDS); => Using the same
        // stopWatch object will cause problem (becacuse of i variable)
        StopWatch redWatch = new StopWatch(TimeUnit.SECONDS);
        StopWatch greenWatch = new StopWatch(TimeUnit.SECONDS);
        StopWatch purpleWatch = new StopWatch(TimeUnit.SECONDS);
        Thread redThread = new Thread(redWatch::countDown, ThreadColor.RED.name());
        Thread greenThread = new Thread(() -> greenWatch.countDown(7), ThreadColor.GREEN.name());
        Thread purpleThread = new Thread(() -> purpleWatch.countDown(7), ThreadColor.PURPLE.name());

        redThread.start();
        greenThread.start();
        purpleThread.start();
    }
}
