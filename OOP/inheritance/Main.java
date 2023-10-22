public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Loi", "25/11/2003", "10/9/2023");
        Employee e2 = new Employee("Aris", "25/11/2005", "10/9/2024");

        System.out.println(e1);
        System.out.println("Age = " + e1.getAge());
        System.out.println("Salary = " + e1.collectPay());

        System.out.println(e2);
        System.out.println("Age = " + e2.getAge());
        System.out.println("Salary = " + e2.collectPay());
    }
}
