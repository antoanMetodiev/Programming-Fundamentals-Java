import javax.swing.*;
import java.util.Scanner;
public class TopNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        findTopInteger(number);
    }

    private static void findTopInteger(int number){
        for (int i = 1; i <= number; i++) {
            boolean firstFlag = checkDigitsDivideOnEight(i,number);
            boolean secondFlag = checkForOneOddDigit(i);
            if (firstFlag){
                if (secondFlag){
                    System.out.println(i);
                }
            }
        }

    }

    private static boolean checkDigitsDivideOnEight(int i,int number) {

        for (int j = i; j <= number; j++) {
            String digits = "" + j;
            int saver = 0;
            for (int k = 0; k < digits.length(); k++) {
                char currentSymbol = digits.charAt(k);
                String reverse = "" + currentSymbol;
                int CuurentNumber = Integer.parseInt(reverse);
                saver += CuurentNumber;
            }
            if (saver % 8 == 0) {
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    private static boolean checkForOneOddDigit(int i) {
        String digits = "" + i;
        int saver = 0;
        for (int j = 0; j < digits.length(); j++) {
            char currentDigit = digits.charAt(j);
            String reverse = "" + currentDigit;
            int number = Integer.parseInt(reverse);
            saver = number;
            if (saver % 2 != 0){
                return true;
            }
        }
        return false;
    }
}
