import java.util.Scanner;
public class PalindromeIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        checkPalindromNum(number,scanner);
    }

    private static void checkPalindromNum(String number,Scanner scanner){
        while (!number.equals("END")){

            String temp = number;
            String saver = "";
            for (int i = number.length() - 1; i >= 0; i--) {
               char currentDigit = number.charAt(i);
               saver += "" + currentDigit;
            }
            if (temp.equals(saver)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            number = scanner.nextLine();
        }
    }
}
