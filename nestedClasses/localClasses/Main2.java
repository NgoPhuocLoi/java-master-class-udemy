package localClasses;

import java.util.ArrayList;
import java.util.Comparator;
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
        System.out.println();

        sortIt(employees, new Comparator<StoreEmployee>() {

            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o2.getName().compareTo(o1.getName());
            }

        }.reversed());
    }

    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {
        list.sort(comparator);
        for (var e : list) {
            System.out.println(e);
        }
    }
}
