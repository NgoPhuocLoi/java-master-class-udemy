package staticNestedClasses_InnerClasses;

import java.util.Comparator;

public class StoreEmployee extends Employee {

    public class StoreComparator<T extends StoreEmployee> implements Comparator<StoreEmployee> {

        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int result = o1.store.compareTo(o2.store);
            if (result == 0) {
                return new Employee.EmployeeComparator<>("year").compare(o1, o2);
            }
            return result;
        }

    }

    private String store;

    public StoreEmployee(String id, String name, int startedYear, String store) {
        super(id, name, startedYear);
        this.store = store;
    }

    public StoreEmployee() {
        super();
    }

    @Override
    public String toString() {
        return "%s %s".formatted(store, super.toString());
    }

}
