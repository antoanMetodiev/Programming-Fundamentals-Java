import java.util.Arrays;
import java.util.Scanner;
public class AddAndSubtract {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int sum = sumNumbers(firstNum,secondNum);
        System.out.println(sum - thirdNum);
    }

    private static int sumNumbers(int firstNum,int secondNum){
        return firstNum + secondNum;
    }
}
