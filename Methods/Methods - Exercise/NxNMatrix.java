import java.util.Scanner;
public class NxNMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printRows(n);
    }

    private static void printRows(int n){
        for (int r = 0; r < n; r++) {
            printDigits(n);
        }
    }

    private static void printDigits(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
