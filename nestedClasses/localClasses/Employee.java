package localClasses;

import java.util.Comparator;

public class Employee {
    public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {
        private String sortedType;

        public EmployeeComparator(String sortedType) {
            this.sortedType = sortedType;
        }

        public EmployeeComparator() {
            this("name");
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if (sortedType.equalsIgnoreCase("year")) {
                return o1.startedYear - o2.startedYear;
            }
            return o1.name.compareTo(o2.name);
        }

    }

    private String id, name;
    private int startedYear;

    public Employee(String id, String name, int startedYear) {
        this.id = id;
        this.name = name;
        this.startedYear = startedYear;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + id + "'" +
                ", name='" + name + "'" +
                ", startedYear='" + startedYear + "'" +
                "}";
    }

}