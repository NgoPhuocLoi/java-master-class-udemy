import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {
        // test_toString_sort_fill_copyOf();
        test_binarySearch_equals();
    }

    public static int[] getRandomIntArray(int len) {
        int[] result = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }

    public static void test_toString_sort_fill_copyOf() {
        int[] arr1 = getRandomIntArray(10);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        int[] arr2 = new int[6];
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2, 10);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        int[] arr3 = getRandomIntArray(10);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr3, arr3.length);
        System.out.println(Arrays.toString(arr4));

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        int[] smallerArr3 = Arrays.copyOf(arr3, 5);
        System.out.println(Arrays.toString(smallerArr3));

        int[] largerArr3 = Arrays.copyOf(arr3, 15);
        System.out.println(Arrays.toString(largerArr3));
    }

    public static void test_binarySearch_equals() {
        int[] intArr = getRandomIntArray(10);
        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        if (Arrays.binarySearch(intArr, 10) >= 0) {
            System.out.println("Found 10 in the list");
        }

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("arr1 is equal arr2");
        }
    }

}
