package executorService;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main3 {
    public static void main(String[] args) {
        ExecutorService multipleExecutor = Executors.newCachedThreadPool();
        List<Callable<Integer>> taskList = List.of(
                () -> sumWithReturn(1, 10, 1, "red"),
                () -> sumWithReturn(10, 100, 10, "blue"),
                () -> sumWithReturn(2, 20, 2, "green"));
        try {
            var results = multipleExecutor.invokeAll(taskList);
            for (var result : results) {
                System.out.println(result.get(500, TimeUnit.MILLISECONDS));
            }

            System.out.println(multipleExecutor.invokeAny(taskList));
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            multipleExecutor.shutdown();
        }
    }

    public static void mainWithSubmit(String[] args) {
        ExecutorService multipleExecutor = Executors.newCachedThreadPool();

        try {
            var redResult = multipleExecutor.submit(() -> sumWithReturn(1, 10, 1, "red"));
            var blueResult = multipleExecutor.submit(() -> sumWithReturn(10, 100, 10, "blue"));
            var greenResult = multipleExecutor.submit(() -> sumWithReturn(2, 20, 2, "green"));

            try {
                System.out.println(redResult.get(500, TimeUnit.MILLISECONDS));
                System.out.println(blueResult.get(500, TimeUnit.MILLISECONDS));
                System.out.println(greenResult.get(500, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                // TODO: handle exception
            }

        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            multipleExecutor.shutdown();
        }

    }

    public static void mainWithExecute(String[] args) {
        ExecutorService multipleExecutor = Executors.newCachedThreadPool();
        try {
            multipleExecutor.execute(() -> sumWithoutReturn(1, 10, 1, "red"));
            multipleExecutor.execute(() -> sumWithoutReturn(10, 100, 10, "blue"));
            multipleExecutor.execute(() -> sumWithoutReturn(2, 20, 2, "green"));
            multipleExecutor.execute(() -> sumWithoutReturn(1, 10, 1, "red"));
            multipleExecutor.execute(() -> sumWithoutReturn(10, 100, 10, "blue"));
            multipleExecutor.execute(() -> sumWithoutReturn(2, 20, 2, "green"));

            try {
                Thread.sleep(500);

                System.out.println("=== New tasks will be executed! ===");
                // Previous threads may be reused!
                multipleExecutor.execute(() -> sumWithoutReturn(1, 10, 1, "red"));
                multipleExecutor.execute(() -> sumWithoutReturn(10, 100, 10, "blue"));
                multipleExecutor.execute(() -> sumWithoutReturn(2, 20, 2, "green"));
            } catch (Exception e) {
                // TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            multipleExecutor.shutdown();
        }
    }

    public static void sumWithoutReturn(int start, int end, int delta, String colorStr) {

        ThreadColor threadColor = ThreadColor.RESET;

        try {
            threadColor = ThreadColor.valueOf(colorStr.toUpperCase());
        } catch (Exception e) {
            // TODO: handle exception
        }

        String color = threadColor.color();

        int sum = 0;

        for (int i = start; i <= end; i += delta)
            sum += i;
        System.out.println("%s%s %s sum = %d".formatted(color, Thread.currentThread().getName(), colorStr, sum));
    }

    public static int sumWithReturn(int start, int end, int delta, String colorStr) {

        ThreadColor threadColor = ThreadColor.RESET;

        try {
            threadColor = ThreadColor.valueOf(colorStr.toUpperCase());
        } catch (Exception e) {
            // TODO: handle exception
        }

        String color = threadColor.color();

        int sum = 0;

        for (int i = start; i <= end; i += delta)
            sum += i;
        System.out.println("%s%s %s sum = %d".formatted(color, Thread.currentThread().getName(), colorStr, sum));
        return sum;
    }
}
