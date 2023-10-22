package polymorphism;

public class Main2 {
    public static void main(String[] args) {
        Object unknownObject = Movie.getMovie("S", "Airplane");

        if (unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy comedy = (Comedy) unknownObject;
            comedy.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScientificAction sa) {
            sa.watchScieneFiction();
        }
    }
}
