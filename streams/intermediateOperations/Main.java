package intermediateOperations;

import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.iterate((int) 'A', c -> c <= (int) 'z', c -> c + 1)
                .filter(Character::isAlphabetic)
                .dropWhile(c -> Character.toUpperCase(c) < 'E')
                .skip(10)
                .forEach(c -> System.out.printf("%c ", c));

        System.out.println();
        Random random = new Random();
        Stream.generate(() -> random.nextInt((int) 'A', (int) 'Z' + 1)).limit(50).distinct().sorted()
                .forEach(c -> System.out.printf("%c ", c));
    }
}
