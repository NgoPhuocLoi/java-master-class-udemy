package polymorphism.challenge;

public class ElectricCar extends Car {
    private int batterySize;
    private double avgKmPerCharge;

    public ElectricCar(String description, int batterySize, double avgKmPerCharge) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric -> startEngine");
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric -> running Engine");
    }
}
