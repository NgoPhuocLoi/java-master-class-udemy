package examples;

import java.util.Arrays;

public class SortingWithLambda {
    public static void main(String[] args) {
        Integer[] nums = new Integer[] { 9, 6, 1, 2, 4, 5, 122, 1, 2, 355, 3 };
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums, (a, b) -> b - a);
        System.out.println(Arrays.toString(nums));
    }
}