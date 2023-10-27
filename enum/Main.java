import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek friday = DayOfTheWeek.FRI;

        System.out.println(friday);

        for (int i = 0; i < 10; i++) {
            DayOfTheWeek ranDay = getRandomDay();
            System.out.printf("Name = %s, ordinal = %d%n", ranDay.name(), ranDay.ordinal());
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int ranInt = new Random().nextInt(7);
        DayOfTheWeek[] days = DayOfTheWeek.values();
        return days[ranInt];
    }
}