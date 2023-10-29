package student_query;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student());
        }

        printMoreList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lpaStudents.add(new LPAStudent());
        }

        printMoreList(lpaStudents);

        var queryList = new QueryList<>(students);

        List<Student> studentsIn2022 = queryList.getMatches("YEAR", "2022");
        printMoreList(studentsIn2022);

        List<LPAStudent> lpaStudentsLearnedJS = QueryList.getMatches(lpaStudents, "COURSE", "Javascript");

        printMoreList(lpaStudentsLearnedJS);

        // List<Employee> employees = new ArrayList<>();
        // List<Employee> testQueryEmployee = QueryList.getMatches(employees, "NAME",
        // "helo"); -> can not be used

    }

    public static void printMoreList(List<? extends Student> l) {
        for (Student s : l) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static <T extends Student> void printList(List<T> l) {
        for (T s : l) {
            System.out.println(s);
        }
        System.out.println();
    }
}
