import java.util.Scanner;
public class MultiplicationTable2_0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int i = num2;

        for (i = num2; i <= 10 ; i++) {

            int result = num1 * i;
            System.out.printf("%d X %d = %d\n",num1, i, result);
            if (i == 10){
                return;
            }
        }
        int result = num1 * num2;
        System.out.printf("%d X %d = %d\n",num1, i, result);
    }
}
