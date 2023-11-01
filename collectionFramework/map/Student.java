package map;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Course(String courseId, String name, String subject) {
}

record Purchase(String courseId, int studentId, double price, int year, int dayOfYear) {
    public LocalDate purchaseDay() {
        return LocalDate.ofYearDay(year, dayOfYear);
    }
}

public class Student {
    private static int lastId = 1;

    private String name;
    private int id;
    List<Course> courses;

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
        this.id = lastId++;
    }

    public Student(String name, Course course) {
        this(name, new ArrayList<>(List.of(course)));
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }

    @Override
    public String toString() {
        String[] courseNames = new String[courses.size()];
        Arrays.setAll(courseNames, i -> courses.get(i).name());

        return "[%d]: %s".formatted(id, String.join(", ", courseNames));
    }
}
