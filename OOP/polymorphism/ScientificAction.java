package polymorphism;

public class ScientificAction extends Movie {
    public ScientificAction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out
                .println(String.format(".. %s%n".repeat(3), "Bad Aliens do bad stuff", "Space guys chase aliens",
                        "Planet blows up"));
    }

    public void watchScieneFiction() {
        System.out.println("Watching a ScieneFiction...!");
    }
}
