package composition;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return this.hasWorkToDo;
    }

    public boolean getHasWorkToDo() {
        return this.hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("brewCoffee is being done!");
            return;
        }
        System.out.println("CoffeeMaker is brewing coffee!");
    }
}
