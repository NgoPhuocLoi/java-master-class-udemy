package generic_challenge;

public abstract class Point implements Mappable {
    private Location location;

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Point(Location location) {
        this.location = location;
    }

}
