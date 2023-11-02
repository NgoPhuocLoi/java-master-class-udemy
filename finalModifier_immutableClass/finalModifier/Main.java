package finalModifier;

public class Main {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        BaseClass childRef = new ChildClass();
        ChildClass child = new ChildClass();

        System.out.println("=== Instance method ===");
        base.method1();
        childRef.method1();
        child.method1();
        System.out.println();

        System.out.println("=== Static method ===");
        BaseClass.method1Static();
        BaseClass.method1Static();
        BaseClass.method1Static();
        System.out.println();

        StringBuilder message = new StringBuilder("Message 1");
        Logger.logToConsole(message);
        message.append(" and Message 2");
        Logger.logToConsole(message);
        System.out.println("Message after logging: " + message);

    }
}
