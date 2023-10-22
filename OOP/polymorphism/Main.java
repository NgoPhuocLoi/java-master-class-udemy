package polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Star Wars");
        movie.watchMovie();
        Movie adventureMovie = new Adventure("Black Adam");
        adventureMovie.watchMovie();
        Movie comedyMovie = new Comedy("Mr. Bean");
        comedyMovie.watchMovie();
        Movie alienMovie = new ScientificAction("Alien");
        alienMovie.watchMovie();

        // Using static factory method to create an object
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for comedy, S for Sciene Fiction, or Q to quit): ");
            String type = sc.nextLine();

            if ("qQ".contains(type))
                break;

            System.out.println("Enter Title: ");
            String title = sc.nextLine();

            Movie m = Movie.getMovie(type, title);

            m.watchMovie();
        }

        sc.close();
    }
}
