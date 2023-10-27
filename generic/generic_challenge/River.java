package generic_challenge;

public class River extends Line {
    private String name;

    public River(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLocation(Location location) {
        super.addLocation(location);
    }

    @Override
    public void render() {
        System.out.println(String.format("Render %s as %s (%s)", name, super.getClass().getSimpleName().toUpperCase(),
                getLocations()));
    }
}
