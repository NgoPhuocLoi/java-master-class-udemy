package generic_challenge;

public class Park extends Point {
    private String name;

    public Park(String name, Location location) {
        super(location);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println(String.format("Render %s as %s (%s)", name, super.getClass().getSimpleName().toUpperCase(),
                getLocation()));
    }
}
