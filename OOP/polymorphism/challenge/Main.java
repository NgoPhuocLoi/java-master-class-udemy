package polymorphism.challenge;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("My car");
        runRace(c);

        Car g = new GasPoweredCar("Gas powered car", 6, 15.6);
        runRace(g);

        Car e = new ElectricCar("Electric Car", 5000, 200);

        runRace(e);

        Car h = new HybirdCar("Hybrid Car", 2000, 120, 6);

        runRace(h);
    
    }

    public static void runRace(Car c) {
        c.startEngine();
        c.drive();
    }
}
