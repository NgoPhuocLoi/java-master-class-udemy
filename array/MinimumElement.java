import java.util.Arrays;

public class MinimumElement {

    public static int[] readIntegers(String... args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int e : arr) {
            if (e < minVal)
                minVal = e;
        }
        return minVal;
    }

    public static void main(String[] args) {
        int[] arr = readIntegers(args);
        System.out.println(Arrays.toString(arr));
        int minVal = findMin(arr);
        System.out.println("Min value: " + minVal);
    }
}