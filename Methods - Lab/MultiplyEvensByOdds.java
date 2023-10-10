import java.util.Arrays;
import java.util.Scanner;
public class MultiplyEvensByOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        number = Math.abs(number);
        System.out.println(calculateEvenAndOddDigits(number));
    }

    private static int calculateEvenAndOddDigits(int number) {
        int evenNums = 0;
        int oddNums = 0;
        while(number > 0){

            int lastDigit = number % 10;
            if (lastDigit % 2 == 0){
                evenNums += lastDigit;
            }
            else{
                oddNums += lastDigit;
            }
            number /= 10;
        }
        return evenNums * oddNums;
    }

}
