package generic_challenge;

import java.util.ArrayList;

public class Layer<T extends Mappable> {
    private ArrayList<T> elements;

    public Layer() {
        this.elements = new ArrayList<>();
    }

    public ArrayList<T> getElements() {
        return this.elements;
    }

    public void addElement(T e) {
        this.elements.add(e);
    }

    public void renderLayer() {
        for (T e : elements) {
            e.render();
        }
    }
}
