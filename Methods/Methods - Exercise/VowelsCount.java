import java.util.Locale;
import java.util.Scanner;
public class VowelsCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] text = scanner.nextLine().toLowerCase(Locale.ROOT).toCharArray();
        int result = checkVowelsCount(text);
        System.out.println(result);
    }

    private static int checkVowelsCount(char[] text){

        int counter = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == 97 || text[i] == 101
                    || text[i] == 105 || text[i] == 111 || text[i] == 117){
                 counter++;
            }
        }
        return counter;
    }
}
