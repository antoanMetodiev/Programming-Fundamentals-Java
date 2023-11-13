import java.util.Scanner;

public class GreaterOfTwoValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("string")){
            String firstText = scanner.nextLine();
            String secondText = scanner.nextLine();
            System.out.println(compareStrings(firstText,secondText));
        }
        else if (type.equals("int")){
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(compareInts(firstNum,secondNum));
        }
        else if (type.equals("char")){
            char firstSymbol = scanner.nextLine().charAt(0);
            char secondSymbol = scanner.nextLine().charAt(0);
            System.out.println(compareChars(firstSymbol,secondSymbol));
        }
    }

    private static String compareStrings(String firstText,String secondText) {
        if (firstText.compareTo(secondText) > 0){
            return firstText;
        }else{
            return secondText;
        }
    }

    private static int compareInts(int firstNum,int secondNum) {
        if (firstNum > secondNum){
            return firstNum;
        }else{
            return secondNum;
        }
    }

    private static char compareChars(char firstSymbol,char secondSymbol) {
        if (firstSymbol > secondSymbol){
            return firstSymbol;
        }else{
            return secondSymbol;
        }
    }
}
