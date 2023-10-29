package comparable_comparator;

import java.util.Arrays;
import java.util.Comparator;

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getGpa() + o1.getName()).compareTo(o2.getGpa() + o2.getName());
    }
}

public class TestComparable {
    public static void main(String[] args) {
        Student[] students = new Student[] { new Student("Zim", 13), new Student("Loi", 20), new Student("Aris", 39) };

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new StudentComparator());

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new StudentComparator().reversed());

        System.out.println(Arrays.toString(students));
    }
}
