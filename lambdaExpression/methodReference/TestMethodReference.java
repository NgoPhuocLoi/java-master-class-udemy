package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

class PlainOld {
    private static int COUNT = 1;

    private int id;

    public PlainOld() {
        id = COUNT++;
        System.out.println("An PlanOld object was created with id: " + id);
    }
}

public class TestMethodReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Loi", "Annna", "icy", "Cris");

        names.forEach(System.out::println);

        System.out.println("------------");
        System.out.println(calculator(Integer::sum, 10, 25));
        System.out.println(calculator(Double::sum, 10.0, 2.5));

        System.out.println(calculator(String::concat, "Ngo ", "Loi"));
        // System.out.println(calculator((a, b) -> a.concat(b), "Ngo ", "Loi"));

        System.out.println("-------------");
        Supplier<PlainOld> plainOldSupplier = PlainOld::new;
        PlainOld o1 = plainOldSupplier.get();

        System.out.println("--------------");
        System.out.println("Hello is tranformed to: " + "hello".transform(String::toUpperCase));
    }

    public static <T> T calculator(BinaryOperator<T> operator, T value1, T value2) {
        var result = operator.apply(value1, value2);
        return result;
    }
}
