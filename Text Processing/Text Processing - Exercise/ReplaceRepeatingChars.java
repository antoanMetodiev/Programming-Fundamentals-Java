import java.util.Scanner;
public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < input.length() - 1; i++) {
            int currentDigit = input.charAt(i);
            int nextDigit = input.charAt(i + 1);
            if (currentDigit == nextDigit){
                input.delete(i,i + 1);
                i--;
            }
        }
        System.out.println(input);
    }
}
