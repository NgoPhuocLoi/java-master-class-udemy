package abstraction;

public abstract class ListItem {
    protected ListItem rightLink, leftLink;
    protected Object value;

    public ListItem(Object o) {
        this.value = o;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object o) {
        value = o;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem i);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem i);

    abstract int compareTo(ListItem i);
}
