import java.util.Locale;
import java.util.Scanner;
public class CharactersInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        if (firstSymbol > secondSymbol){
            char temp = firstSymbol;
            firstSymbol = secondSymbol;
            secondSymbol = temp;
        }
        printCharactersInRange(firstSymbol,secondSymbol);
    }

    private static void printCharactersInRange(char firstSymbol,char secondSymbol){
        for (int i = firstSymbol + 1; i < secondSymbol; i++) {
            char currentSymbol = (char)i;
            System.out.print(currentSymbol + " ");
        }
    }
}
