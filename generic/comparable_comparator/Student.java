package comparable_comparator;

import java.util.Random;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.gpa = Math.round((new Random().nextDouble(1.0, 4.0) * 100)) * 1.0 / 100;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", gpa='" + getGpa() + "'" +
                "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }
}
