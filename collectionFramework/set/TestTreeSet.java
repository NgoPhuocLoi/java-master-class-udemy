package set;

import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        NavigableSet<Integer> orderedSet = new TreeSet<>(
                List.of(8, 4, 2, 1, 2, 22, 31, 33, 4, 131, 312, 312, 3, 123, 123, 123));

        int max = Collections.max(orderedSet);
        int min = Collections.min(orderedSet);
        int first = orderedSet.first();
        int last = orderedSet.last();
        System.out.println(orderedSet);
        System.out.println("max = " + max);
        System.out.println("first = " + first);
        System.out.println("min = " + min);
        System.out.println("last = " + last);

        NavigableSet<Integer> descOrderedSet = orderedSet.descendingSet();
        System.out.println(descOrderedSet);

        System.out.println("higher(8) = " + orderedSet.higher(8));
        System.out.println("ceiling(8) = " + orderedSet.ceiling(8));
        System.out.println("lower(8) = " + orderedSet.lower(8));
        System.out.println("floor(8) = " + orderedSet.floor(8));

        System.out.println("headSet(8)" + orderedSet.headSet(8));
        System.out.println("tailSet(8)" + orderedSet.tailSet(8));
        System.out.println("subSet(8, 44)" + orderedSet.subSet(8, 44));
    }
}
