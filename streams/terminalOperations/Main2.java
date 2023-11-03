package terminalOperations;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {

        var numberStream = Stream.generate(Main2::randomNum).limit(100);

        List<Integer> oddNumberList = numberStream.filter(Main2::isOdd).filter(n -> n > 20).toList();

        System.out.println(oddNumberList);

        System.out.println("Odd number count: " + oddNumberList.stream().count());

        Set<Integer> oddNumSet = oddNumberList.stream().collect(Collectors.toSet());
        System.out.println("Odd num set: " + oddNumSet);

        Set<Integer> oddNumSetUnderThirty = oddNumberList.stream().filter(n -> n < 30).collect(Collectors.toSet());
        System.out.println("oddNumSetUnderThirty: " + oddNumSetUnderThirty);

        Set<Integer> sortedOddNumSetUnder30 = oddNumberList.stream().filter(n -> n < 30).collect(TreeSet::new,
                TreeSet::add, TreeSet::addAll);
        System.out.println("sortedOddNumSetUnder30 : " + sortedOddNumSetUnder30);

        var sumOfOddNumUnder30 = oddNumberList.stream().filter(n -> n < 30).reduce(0, (p, n) -> {
            System.out.println(p + " " + n);
            return p + n;
        });

        System.out.println("sumOfOddNumUnder30 : " + sumOfOddNumUnder30);

        oddNumberList.stream().filter(n -> n < 10).max(Comparator.naturalOrder()).ifPresentOrElse(
                (m) -> System.out.println("Max of odd number under 10: " + m),
                () -> System.out.println("There is not any odd number runder 10"));

    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static int randomNum() {
        Random random = new Random();
        return random.nextInt(0, 100);
    }
}
