package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerWithLambda {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Banana", "Strawberry", "Apple", "Pinapple", "Durian"));

        System.out.println("forEach method with Consumer: ");
        fruits.forEach(new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println("\t" + t);
            }

        });
        System.out.println("\nforEach method with lambda: ");
        fruits.forEach(f -> System.out.println("\t" + f));
    }
}
