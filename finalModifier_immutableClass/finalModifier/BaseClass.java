package finalModifier;

public class BaseClass {
    public final void method1() {
        System.out.println("[Base class]: Method 1");
        method2();
        method3();
    }

    protected void method2() {
        System.out.println("[Base class]: Method 2");
    }

    private void method3() {
        System.out.println("[Base class]: Method 3");
    }

    public final static void method1Static() {
        System.out.println("[Base class]: Method 1 Static");
        method2Static();
        method3Static();
    }

    protected static void method2Static() {
        System.out.println("[Base class]: Method 2 Static");
    }

    private static void method3Static() {
        System.out.println("[Base class]: Method 3 Static");
    }
}