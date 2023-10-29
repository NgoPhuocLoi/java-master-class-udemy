package localClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
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
        getPigLatinName(employees);
    }

    public static void getPigLatinName(List<? extends StoreEmployee> list) {
        String lastname = "Piggy";
        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee> {
            private String pigLatinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLatinName, Employee originalInstance) {
                this.pigLatinName = pigLatinName + " " + lastname;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }
        List<DecoratedEmployee> decoratedList = new ArrayList<>(list.size());

        for (var e : list) {
            String name = e.getName();
            String pigLatinName = name.substring(1) + name.charAt(0) + "ay";
            decoratedList.add(new DecoratedEmployee(pigLatinName, e));
        }
        decoratedList.sort(null);
        for (var decoratedE : decoratedList) {
            System.out.println(decoratedE);
        }
    }
}
