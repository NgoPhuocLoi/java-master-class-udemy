package map;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

public class TestSortedMap {
    private static LinkedHashMap<String, Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();

    public static void main(String[] args) {
        Course java = new Course("java001", "Java class", "Java");
        Course py = new Course("python001", "Python for beginer", "Python");
        Course js = new Course("js001", "Javascript master class", "Javascript");

        addPurchase("Mary", js, 134.68);
        addPurchase("Adam", java, 144.56);
        addPurchase("Mary", java, 144.65);
        addPurchase("Brown", py, 123.33);
        addPurchase("Zoe", js, 111.11);

        addPurchase("Rudy", js, 134.68);
        addPurchase("Adam", py, 144.56);
        addPurchase("Zoe", java, 144.65);
        addPurchase(" Musta", py, 123.33);
        addPurchase("Riska", js, 111.11);

        purchases.forEach((k, v) -> System.out.println("%s: %s".formatted(k, v)));
        System.out.println("-".repeat(20));
        students.forEach((k, v) -> System.out.println("%s: %s".formatted(k, v)));

        NavigableMap<LocalDate, List<Purchase>> datedPurchase = new TreeMap<>();
        for (Purchase p : purchases.values()) {
            datedPurchase.compute(p.purchaseDay(), (date, pList) -> {
                List<Purchase> l = datedPurchase.getOrDefault(date, new ArrayList<>());
                l.add(p);
                return l;
            });
        }

        System.out.println();
        datedPurchase.forEach((k, v) -> System.out.println(k + ": " + v));

        LocalDate firstDate = LocalDate.ofYearDay(LocalDate.now().getYear(), 1);
        LocalDate week1 = firstDate.plusDays(7);

        Map<LocalDate, List<Purchase>> week1Purchases = datedPurchase.headMap(week1);
        Map<LocalDate, List<Purchase>> week2Purchases = datedPurchase.tailMap(week1);
        System.out.println("\nWeek 1's purchases: ");
        week1Purchases.forEach((k, v) -> System.out.println(k + ": " + v));
        printStats(1, week1Purchases);
        System.out.println("Week 2's purchases: ");
        week2Purchases.forEach((k, v) -> System.out.println(k + ": " + v));
        printStats(2, week2Purchases);
    }

    public static void addPurchase(String studentName, Course course, double price) {
        Student foundStudent = students.get(studentName);

        if (foundStudent == null) {
            foundStudent = new Student(studentName, course);
            students.put(studentName, foundStudent);

        } else {
            foundStudent.addCourse(course);
        }

        int day = new Random().nextInt(1, 15);
        String purchaseKey = course.courseId() + "_" + foundStudent.getId();
        int year = LocalDate.now().getYear();

        Purchase newPurchase = new Purchase(course.courseId(), foundStudent.getId(), price, year, day);

        purchases.put(purchaseKey, newPurchase);
    }

    public static void printStats(int period, Map<LocalDate, List<Purchase>> periodData) {
        Map<String, Integer> weeklyCount = new TreeMap<>();

        for (var v : periodData.values()) {
            for (var p : v) {
                weeklyCount.merge(p.courseId(), 1, Integer::sum);
            }
        }

        System.out.println("Week %d purchases = %s%n".formatted(period, weeklyCount));
    }
}
