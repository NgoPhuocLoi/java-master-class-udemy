package terminalOperations;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var result = IntStream.iterate(1, n -> n <= 1000, n -> n + 1).summaryStatistics();

        System.out.println("Statistic: " + result);

        var leapYearStats = IntStream.iterate(2020, n -> n <= 2025, n -> n + 1)
                .filter(n -> (n % 4 == 0 || (n % 400 == 0 && n % 100 != 0))).peek(n -> System.out.println(n))
                .summaryStatistics();

        System.out.println("Leap year stats: " + leapYearStats);

        System.out.println("-".repeat(20));
        Seed[] seeds = new Seed[100];
        Arrays.setAll(seeds, i -> new Seed());
        var bookedSeedCount = Arrays.stream(seeds).filter(Seed::isBooked).count();
        var hasAnyBookedSeed = Arrays.stream(seeds).anyMatch(Seed::isBooked);
        var allSeedAreBooked = Arrays.stream(seeds).allMatch(Seed::isBooked);
        var NoneSeedIsBooked = Arrays.stream(seeds).noneMatch(Seed::isBooked);

        System.out.println("Booked seed: " + bookedSeedCount);
        System.out.println("hasAnyBookedSeed : " + hasAnyBookedSeed);
        System.out.println("allSeedAreBooked : " + allSeedAreBooked);
        System.out.println("NoneSeedIsBooked : " + NoneSeedIsBooked);
    }
}
