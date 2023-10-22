package composition;

public class Dishwasher {
    private boolean hasWorkToDo;

    public Dishwasher(boolean hasWorkToDo) {
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

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("doDishes is being done!");
            return;
        }
        System.out.println("Dishwasher is doing dishes!");
    }
}
