package staticNestedClasses_InnerClasses;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<StoreEmployee> employees = new ArrayList<>(
                List.of(new StoreEmployee("0001", "Cris", 2021, "Store A"),
                        new StoreEmployee("0002", "Matus", 2017, "Store B"),
                        new StoreEmployee("0003", "Peter", 2015, "Store A"),
                        new StoreEmployee("0004", "Zeris", 2012, "Store C")));

        for (StoreEmployee e : employees) {
            System.out.println(e);
        }

        employees.sort(new StoreEmployee.EmployeeComparator<>().reversed());

        System.out.println();
        for (StoreEmployee e : employees) {
            System.out.println(e);
        }

        employees.sort(new StoreEmployee().new StoreComparator<>());

        System.out.println();
        for (StoreEmployee e : employees) {
            System.out.println(e);
        }
    }
}
