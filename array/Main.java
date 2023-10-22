import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArr = new int[] { 1, 2, 3, 4, 5 };

        for (int element : intArr) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(intArr));

        Object objVar = intArr;

        if (objVar instanceof int[]) {
            System.out.println("objVar is really an int array!");
        }

        // array can store multiple type by using Object[] (but it's not a good
        // practice)
        Object[] objectArr = new Object[3];
        objectArr[0] = "Hello";
        objectArr[1] = new StringBuilder("World");
        objectArr[2] = intArr;

    }
}