package convenienceMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

record Person(String firstName, String lastName) {
}

public class TestChanningLambda {
    public static void main(String[] args) {
        String name = "Loi";

        Function<String, String> uCase = String::toUpperCase;
        Function<String, String> lastName = (s) -> s + " Ngo";
        Function<String, String> uCaseLastName = uCase.andThen(lastName);

        // apply uCase -> lastName
        System.out.println(uCaseLastName.apply(name));

        uCaseLastName = uCase.compose(lastName);
        // apply lastname -> uCase
        System.out.println(uCaseLastName.apply(name));

        Function<String, String[]> f0 = uCase.andThen(lastName).andThen((s) -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));

        Predicate<String> p1 = (s) -> s.equals("Loi");
        Predicate<String> p2 = s -> s.startsWith("L");
        Predicate<String> p3 = s -> s.endsWith("n");

        System.out.println(p1.and(p2).test(name));
        System.out.println(p1.or(p3).test("Lion"));

        List<Person> persons = new ArrayList<>(List.of(
                new Person("Loi", "Ngo"),
                new Person("An", "Ngo"),
                new Person("Lian", "Chan"),
                new Person("Colum", "Aris")));

        persons.forEach(System.out::println);
        System.out.println();

        persons.sort(Comparator.comparing(Person::lastName));
        persons.forEach(System.out::println);
        System.out.println();

        persons.sort(Comparator.comparing(Person::lastName).thenComparing(Person::firstName));
        persons.forEach(System.out::println);
        System.out.println();
    }
}
