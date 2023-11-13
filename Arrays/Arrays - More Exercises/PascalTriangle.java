import java.util.Scanner;
public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = Integer.parseInt(scanner.nextLine());
        generatePascalTriangle(numRows);
    }

    public static void generatePascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {

            int currentValue = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(currentValue + " ");
                currentValue = currentValue * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
