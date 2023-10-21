import java.util.Scanner;
public class FactorialDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double firstF = printFirstNumFact(firstNum);
        double secondF = printSecondNumFact(secondNum);
        double result = firstF / secondF;
        System.out.printf("%.2f",result);
    }

    private static double printFirstNumFact(int firstNum) {

        double result = firstNum;
        for (int i = 1; i < firstNum; i++) {
            result = result * (firstNum - i);
        }
        return result;
    }

    private static double printSecondNumFact(int secondNum) {
        double result = secondNum;
        for (int i = 1; i < secondNum; i++) {
            result = result * (secondNum - i);
        }
        return result;
    }

}
