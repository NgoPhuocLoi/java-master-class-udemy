package streamSource;

import java.util.stream.Stream;

public class Challenge {
    public static void main(String[] args) {
        int start = 1;
        var streamB = Stream.iterate(start, n -> n <= 15, n -> n + 1).map(n -> "B" + n);

        start += 15;
        var streamI = Stream.iterate(start, n -> n + 1).limit(15).map(n -> "I" + n);

        Stream.concat(streamB, streamI).forEach(System.out::println);
    }
}
