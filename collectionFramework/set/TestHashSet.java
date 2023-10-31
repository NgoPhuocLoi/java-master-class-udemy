package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<Integer> set1 = getRandomIntSet(5);
        Set<Integer> set2 = getRandomIntSet(5);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("set1 \u222A set2: " + unionSet);

        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("set1 \u2229 set2: " + intersectionSet);

        Set<Integer> differenceSet12 = new HashSet<>(set1);
        differenceSet12.removeAll(set2);
        System.out.println("set1 \\ set2: " + differenceSet12);

        Set<Integer> differenceSet21 = new HashSet<>(set2);
        differenceSet21.removeAll(set1);
        System.out.println("set2 \\ set1: " + differenceSet21);

        Set<Integer> symmetricDifferenceSet = new HashSet<>(unionSet);
        symmetricDifferenceSet.removeAll(intersectionSet);
        System.out.println("symmetricDifferenceSet: " + symmetricDifferenceSet);

    }

    public static Set<Integer> getRandomIntSet(int count) {
        Set<Integer> nums = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomInt = random.nextInt(100);
            while (nums.contains(randomInt)) {
                randomInt = random.nextInt(100);
            }
            nums.add(randomInt);
        }

        return nums;
    }
}
