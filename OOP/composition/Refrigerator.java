package composition;

public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
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

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("orderFood is being done!");
            return;
        }
        System.out.println("Refrigerator is ordering food!");
    }
}