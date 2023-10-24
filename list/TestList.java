import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Cris");
        names.add("Coloumbu");
        System.out.println(names);

        String[] fruits = new String[] { "Banana", "Apple", "Pineaple", "Dragon Fruit", "Banana" };
        ArrayList<String> fruitList = new ArrayList<>(List.of(fruits));

        System.out.println(fruitList);

        if (fruitList.contains("Apple")) {
            System.out.println("FruitList contains Apple");
        }

        System.out.println();
        System.out.println(fruitList);
        fruitList.removeAll(List.of("Banana"));
        System.out.println(fruitList);

        System.out.println();
        fruitList.addAll(fruitList);
        System.out.println(fruitList);
        fruitList.sort(Comparator.naturalOrder());
        System.out.println(fruitList);
        fruitList.sort(Comparator.reverseOrder());
        System.out.println(fruitList);

        System.out.println();

        String[] fruitArr = fruitList.toArray(new String[fruitList.size()]);
        System.out.println(Arrays.toString(fruitArr));
    }
}