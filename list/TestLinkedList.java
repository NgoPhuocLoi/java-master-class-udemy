import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import java.util.Iterator;

public class TestLinkedList {
    public static void printFruits(LinkedList<String> list) {
        System.out.println("Start of the list: " + list.getFirst());
        String prev = list.getFirst();
        for (String e : list) {
            System.out.println("\t" + prev + " is before " + e);
            prev = e;
        }
        System.out.println("End of the list: " + list.getLast());
    }

    public static void printFruitsWithIterator(LinkedList<String> list) {
        System.out.println("Start of the list: " + list.getFirst());
        String prev = list.getFirst();
        ListIterator<String> it = list.listIterator(1);
        while (it.hasNext()) {
            String e = it.next();
            System.out.println("\t" + prev + " is before " + e);
            prev = e;
        }
        System.out.println("End of the list: " + list.getLast());
    }

    public static void testIterator(LinkedList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Durian")) {
                it.remove();
            }
            // System.out.print(it.next() + ", ");
        }
        System.out.println(list);
    }

    public static void testListIterator(LinkedList<String> list) {
        ListIterator<String> it = list.listIterator();
        System.out.print("Foreward list: ");
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        System.out.print("\nBackward list: ");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " , ");
        }
    }

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Banana");
        fruits.add(0, "Apple");
        fruits.addLast("Pinapple");
        fruits.addFirst("Plum");

        System.out.println(fruits);

        fruits.remove(2);
        System.out.println(fruits);

        fruits.offer("Water Apple");
        System.out.println(fruits);
        System.out.println(fruits.poll() + " was polled from the List");
        System.out.println(fruits);

        System.out.println();

        System.out.println("The second element of the List: " + fruits.get(1));

        fruits.addAll(List.of("Durian", "Star Apple"));
        printFruitsWithIterator(fruits);

        testIterator(fruits);

        testListIterator(fruits);
    }

}
