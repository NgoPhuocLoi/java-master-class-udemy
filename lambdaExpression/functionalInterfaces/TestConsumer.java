package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class TestConsumer {
    public static void main(String[] args) {
        List<double[]> coors = new ArrayList<>(List.of(
                new double[] { 11.2, 22.4 },
                new double[] { 1.34, 65.33 },
                new double[] { 6.11, 51.23 }));
        coors.forEach(coor -> System.out.println(Arrays.toString(coor)));

        coors.forEach(coor -> processPoint(coor[0], coor[1],
                (a, b) -> System.out.println("la: %.2f - lon: %.2f".formatted(a, b))));
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }
}
