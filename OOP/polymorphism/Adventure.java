package polymorphism;

public class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out
                .println(String.format(".. %s%n".repeat(3), "Pleasant scene", "Scary Music", "Something bad happens"));
    }

    public void watchAdventure() {
        System.out.println("Watching a Adventure...!");
    }
}
