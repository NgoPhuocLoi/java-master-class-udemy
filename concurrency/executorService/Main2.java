package executorService;

import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
        int count = 6;
        var fixedExecutor = Executors.newFixedThreadPool(count, new ColorThreadFactory());
        for (int i = 0; i < count; i++) {
            fixedExecutor.execute(Main::countDown);

        }
        fixedExecutor.shutdown();
    }
}
