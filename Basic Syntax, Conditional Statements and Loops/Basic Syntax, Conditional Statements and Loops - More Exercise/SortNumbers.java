import java.util.Scanner;
public class SortNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.printf("%.0f\n",num1);
                System.out.printf("%.0f\n",num2);
                System.out.printf("%.0f\n",num3);
            } else {
                System.out.printf("%.0f\n",num1);
                System.out.printf("%.0f\n",num3);
                System.out.printf("%.0f\n",num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.printf("%.0f\n",num2);
                System.out.printf("%.0f\n",num1);
                System.out.printf("%.0f\n",num3);
            } else {
                System.out.printf("%.0f\n",num2);
                System.out.printf("%.0f\n",num3);
                System.out.printf("%.0f\n",num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.printf("%.0f\n",num3);
                System.out.printf("%.0f\n",num1);
                System.out.printf("%.0f\n",num2);
            } else {
                System.out.printf("%.0f\n",num3);
                System.out.printf("%.0f\n",num2);
                System.out.printf("%.0f\n",num1);
            }
        }
    }
}
