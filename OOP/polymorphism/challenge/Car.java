package polymorphism.challenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void drive() {
        System.out.println("Car -> drive");
        runEngine();
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(String.format("%s running engine...", instanceType));
    }
}
