import java.util.Scanner;

public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        while (true) {
            String s = sc.nextLine();
            try {
                int num = Integer.parseInt(s);
                sum += num;
                n++;
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(n);
        long avg = (n == 0) ? 0 : sum / n;
        System.out.print("SUM = " + sum + " AVG = " + avg);
        sc.close();
    }

}
