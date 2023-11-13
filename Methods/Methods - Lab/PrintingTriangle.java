import java.util.Scanner;
public class PrintingTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        printTriangle(height);
    }

    private static void printTriangle(int height) {
        printTopHalf(height);
        printSecondHalf(height);
    }

    private static void printTopHalf(int height) {
        for (int i = 1; i < height; i++) {
            printRows(i);
        }
    }

    private static void printSecondHalf(int height) {
        for (int i = height; i >= 1; i--) {
            printRows(i);
        }
    }

    private static void printRows(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }
}
