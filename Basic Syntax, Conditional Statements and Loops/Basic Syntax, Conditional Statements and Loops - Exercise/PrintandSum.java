import java.util.Scanner;
public class PrintandSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int FinishNum = Integer.parseInt(scanner.nextLine());

        int allSum = 0;
        for (int i = startNum; i <= FinishNum ; i++) {
            System.out.printf("%d ", i);
            allSum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d",allSum);
    }
}
