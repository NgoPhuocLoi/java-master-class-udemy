package testCollectionsClass;

public enum Suit {
    CLUB, DIAMON, HEART, SPADE;

    public char getImage() {
        return (new char[] { 9827, 9830, 9829, 9824 })[this.ordinal()];
    }
}