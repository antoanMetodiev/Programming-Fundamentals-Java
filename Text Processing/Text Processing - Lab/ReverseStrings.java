import java.util.Scanner;
public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while(!word.equals("end")){

            String temp = word;
            String newValue = "";
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(word.length() - 1 - i);
                newValue += "" + letter;
            }
            System.out.printf("%s = %s\n", temp, newValue);
            word = scanner.nextLine();
        }
    }
}
