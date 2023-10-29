package opeartion;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculator((a, b) -> a + b, 5, 10));
        System.out.println(calculator((a, b) -> a / b, 4.2, 1.1));
        System.out.println(calculator((String a, String b) -> a.toUpperCase() + " " + b.toUpperCase(), "Ngo", "Loi"));
    }

    public static <T> T calculator(Operation<T> operation, T value1, T value2) {
        T result = operation.operate(value1, value2);
        return result;
    }
}
