package generic_challenge;

public class Main {
    public static void main(String[] args) {
        Park canyonPark = new Park("Grand Canyon National Park", new Location(40.1024, -75.4231));

        River mississippi = new River("Mississippi River");
        mississippi.addLocation(new Location(47.216, -95.2348));
        mississippi.addLocation(new Location(29.1566, -89.2495));
        mississippi.addLocation(new Location(35.1556, -90.0659));

        Layer<Park> parkLayer = new Layer<>();
        parkLayer.addElement(canyonPark);

        Layer<River> riverLayer = new Layer<>();
        riverLayer.addElement(mississippi);

        parkLayer.renderLayer();
        riverLayer.renderLayer();
    }
}
