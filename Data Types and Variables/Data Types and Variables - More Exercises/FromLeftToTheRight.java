import java.util.Arrays;
import java.util.Scanner;
public class FromLeftToTheRight {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
         for (int i = 0; i < n; i++) {
             String input = scanner.nextLine();
            long[] firstNum = Arrays.stream(input.split(" ")).mapToLong(Long::parseLong).toArray();
            if (firstNum[0] > firstNum[1]){
                calculateFirstNumDigits(firstNum);
            }else{
                calculateSecondNumDigits(firstNum);
            }
         }
    }

    private static void calculateFirstNumDigits(long[] firstNum) {

        String saver = "" + firstNum[0];
        int sum = 0;
        for (int i = 0; i < saver.length(); i++) {
            char currentChar = saver.charAt(i);
            String reverse = "" + currentChar;
            if (currentChar != 45){
                sum += Integer.parseInt(reverse);
            }
        }
        System.out.println(sum);
    }

    private static void calculateSecondNumDigits(long[] firstNum) {

        String saver = "" + firstNum[1];
        int sum = 0;
        for (int i = 0; i < saver.length(); i++) {
            char currentChar = saver.charAt(i);
            String reverse = "" + currentChar;
            if (currentChar != 45){
                sum += Integer.parseInt(reverse);
            }
        }
        System.out.println(sum);
    }
}
