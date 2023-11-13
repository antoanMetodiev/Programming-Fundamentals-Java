import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text  = scanner.nextLine().toLowerCase().split("");
        checkPasswordValidation(text);
    }
    private static void checkPasswordValidation(String[] text){
        boolean firstFlag = checkSymbolsCount(text);
        boolean secondFlag = checkForOnlyLettersAndDigits(text);
        boolean thirdflag = checkForTwoNumbers(text);
        if (firstFlag && secondFlag && thirdflag){
            System.out.println("Password is valid");
        }
    }
    private static boolean checkSymbolsCount(String[] text) {
        if (text.length >= 6 && text.length <= 10){
            return true;
        }else{
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }
    private static boolean checkForOnlyLettersAndDigits(String[] text) {
        for (int i = 0; i < text.length; i++) {
            char currentSymbol = text[i].charAt(0);
            if (!((currentSymbol >= 48 && currentSymbol <= 57) || (currentSymbol >= 97 && currentSymbol <= 122))){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }
    private static boolean checkForTwoNumbers(String[] text) {
        int counter = 0;
        for (int i = 0; i < text.length; i++) {
            char currentDigit = text[i].charAt(0);
            if (currentDigit >= 48 && currentDigit <= 57){
                counter++;
                if (counter == 2){
                    return true;
                }
            }
        }
        System.out.println("Password must have at least 2 digits");
        return false;
    }
}