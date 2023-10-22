package encapsulation;

public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int amount) {
        int newAmount = tonerLevel + amount;
        if (newAmount > 100 || newAmount < 0)
            return -1;
        tonerLevel = newAmount;
        return newAmount;
    }

    public int printPages(int pages) {
        int sheets = (duplex) ? pages / 2 + pages % 2 : pages;
        pagesPrinted += sheets;
        return sheets;
    }

    public int getPrintedPages() {
        return pagesPrinted;
    }
}
