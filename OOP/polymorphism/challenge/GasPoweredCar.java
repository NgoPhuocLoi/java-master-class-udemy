package polymorphism.challenge;

public class GasPoweredCar extends Car {
    private int cylinders;
    private double avgKmPerLitre;

    public GasPoweredCar(String description, int cylinders, double avgKmPerLitre) {
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        System.out.println(String.format("Gas -> %d cylinders are fired up!", cylinders));
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas -> running Engine");
    }

}
