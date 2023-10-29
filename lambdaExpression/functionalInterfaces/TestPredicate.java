package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class TestPredicate {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "Loi", "Aris", "Lois", "Anaa", "Ister", "Ivern"));

        System.out.println(names);

        names.removeIf(name -> name.equalsIgnoreCase("ister"));

        System.out.println(names);

        names.removeIf(name -> name.startsWith("Lo"));

        System.out.println(names);
    }
}
