package staticNestedClasses_InnerClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(
                List.of(new Employee("0001", "Cris", 2021), new Employee("0002", "Matus", 2017),
                        new Employee("0003", "Peter", 2015), new Employee("0004", "Zeris", 2012)));

        for (Employee e : employees) {
            System.out.println(e);
        }

        employees.sort(new Employee.EmployeeComparator<>().reversed());

        System.out.println();
        for (Employee e : employees) {
            System.out.println(e);
        }

        employees.sort(new Employee.EmployeeComparator<>("year"));

        System.out.println();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
