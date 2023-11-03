package terminalOperations;

import static java.util.stream.Collectors.filtering;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

record Person(String name, int age, boolean isMale) {
    @Override
    public String toString() {
        return name;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = { "Loi", "Cris", "Anna", "Cynas", "Baroc", "Ristin", "Zoe", "Calocc", "Rodana", "Sonica",
                "Vanae", "Alas", "Aphelios", "Axento", "Alapaba", "Alistedos" };
        List<Person> people = new ArrayList<>(names.length);
        for (String name : names) {
            people.add(new Person(name, random.nextInt(17, 20), random.nextBoolean()));
        }

        var peopleByAge = people.stream().collect(Collectors.groupingBy(Person::age));
        System.out.println("peopleByAge: ");
        peopleByAge.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });

        System.out.println("-".repeat(20));
        var peopleByAgeStartWithA = people.stream()
                .collect(groupingBy(Person::age, filtering((Person p) -> p.name().startsWith("A"), toList())));
        System.out.println("peopleByAgeStartWithA: ");
        peopleByAgeStartWithA.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });

        System.out.println("-".repeat(20));
        var PeopleByGender = people.stream()
                .collect(partitioningBy(p -> p.isMale()));
        System.out.println("PeopleByGender: ");
        PeopleByGender.forEach((k, v) -> {
            System.out.println((k ? "Male" : "Female") + ": " + v);
        });

        System.out.println("-".repeat(20));
        var peopleByGenderAndAge = people.stream()
                .collect(groupingBy(Person::isMale, groupingBy(Person::age)));
        System.out.println("peopleByGenderAndAge: ");
        peopleByGenderAndAge.forEach((k, v) -> {
            System.out.println((k ? "Male" : "Female") + ": ");
            v.forEach((k2, v2) -> {
                System.out.println("\t" + k2 + ": " + v2);
            });
        });
    }
}
