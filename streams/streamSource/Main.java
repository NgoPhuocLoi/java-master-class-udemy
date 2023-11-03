package streamSource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] str = { "One", "Two", "Three" };

        Arrays.stream(str).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Stream.of("Six", "Seven", "Eight").map(String::toUpperCase).forEach(System.out::println);

        System.out.println("-".repeat(20));

        var streamOne = Arrays.stream(str).sorted(Comparator.reverseOrder());
        var streamTwo = Stream.of("Six", "Seven", "Eight").map(String::toUpperCase);

        Stream.concat(streamOne, streamTwo).map(t -> t.charAt(0) + " - " + t).forEach(System.out::println);

        System.out.println("-".repeat(20));
        Random random = new Random();
        Stream.generate(() -> random.nextInt(3)).limit(10).forEach(System.out::println);

        System.out.println("-".repeat(20));
        IntStream.iterate(1, n -> n + 1).limit(20).forEach(n -> System.out.print(n + " "));

        System.out.println("\n" + "-".repeat(20));
        IntStream.iterate(1, n -> n <= 100, n -> n + 1).filter(Main::isPrime).forEach(n -> System.out.print(n + " "));
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
