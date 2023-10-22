package polymorphism.challenge;

public class HybirdCar extends Car {
    private int batterySize;
    private double avgKmPerCharge;
    private int cylinders;

    public HybirdCar(String description, int batterySize, double avgKmPerCharge, int cylinders) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid -> startEngine");
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid -> running Engine");
    }
}
