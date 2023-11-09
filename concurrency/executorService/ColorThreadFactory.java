package executorService;

import java.util.concurrent.ThreadFactory;

public class ColorThreadFactory implements ThreadFactory {
    private String threadName;

    private int colorValue = 1;

    public ColorThreadFactory() {
    }

    public ColorThreadFactory(ThreadColor threadColor) {
        this.threadName = threadColor.name();
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        String name = threadName;
        if (name == null) {
            name = ThreadColor.values()[colorValue].name();
        }
        if (++colorValue >= ThreadColor.values().length)
            colorValue = 1;
        t.setName(name);
        return t;
    }

}
