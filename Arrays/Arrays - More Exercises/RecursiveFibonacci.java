import java.util.Scanner;
public class RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 1 || n > 50) {
            System.out.println("Invalid input. N should be between 1 and 50.");
        } else {
            long result = getFibonacci(n);
            System.out.println(result);
        }
    }

    public static long getFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
