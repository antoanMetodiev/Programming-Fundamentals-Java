import java.text.DecimalFormat;
import java.util.Scanner;
public class CalculateRectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int firstNumber = Integer.parseInt(scanner.nextLine());
       double secondNumber = Double.parseDouble(scanner.nextLine());
       double calculate = calculateRectangleArea(firstNumber,secondNumber);
       DecimalFormat df = new DecimalFormat("0.####");
       System.out.println(df.format(calculate));
    }

    private static double calculateRectangleArea(int firstNum,double secondNum) {
        return firstNum * secondNum;
    }
}
