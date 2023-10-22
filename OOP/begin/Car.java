package begin;

public class Car {
    private String name = "Tesla", model = "M2", color = "Silver";
    private int doors = 4;
    private boolean convertible = true;

    public void describeCar() {
        System.out.println(this.toString());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return this.convertible;
    }

    public boolean getConvertible() {
        return this.convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", model='" + getModel() + "'" +
                ", color='" + getColor() + "'" +
                ", doors='" + getDoors() + "'" +
                ", convertible='" + isConvertible() + "'" +
                "}";
    }

}
