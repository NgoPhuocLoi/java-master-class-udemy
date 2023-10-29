package functionalInterfaces;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        String[] fruits = new String[] { "Apple", "Pinapple", "Durian", "Strawberry", "Banana" };

        String[] randomFruits = getRandomFruits(15, fruits, () -> new Random().nextInt(5));

        System.out.println(Arrays.toString(randomFruits));

    }

    public static String[] getRandomFruits(int count, String[] source, Supplier<Integer> supplier) {
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = source[supplier.get()];
        }

        return result;
    }
}
