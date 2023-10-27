package generic_challenge;

import java.util.ArrayList;

public abstract class Line implements Mappable {
    private ArrayList<Location> locations;

    public Line() {
        this.locations = new ArrayList<>();
    }

    public ArrayList<Location> getLocations() {
        return this.locations;
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }
}
