package student_query;

import java.util.Random;

public class Student implements QueryItem {
    private String name, course;
    private int yearStarted;

    protected static Random random = new Random();
    private static String[] courses = new String[] { "Python", "C++", "Java", "Javascript" };
    private static String[] firstNames = new String[] { "Cris", "Anna", "Lee", "Antom", "Brows" };

    public Student() {
        int lastNameIdx = random.nextInt(65, 91);
        this.name = firstNames[random.nextInt(5)] + " " + (char) lastNameIdx;
        this.course = courses[random.nextInt(4)];
        yearStarted = random.nextInt(2018, 2023);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearStarted() {
        return this.yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %d", name, course, yearStarted);
    }

    @Override
    public boolean matchFieldValue(String field, String value) {
        String fName = field.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEAR" -> yearStarted == Integer.parseInt(value);
            default -> false;
        };
    }
}
