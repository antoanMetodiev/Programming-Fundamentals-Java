import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%c", text.charAt(i) + 3);
        }
    }
}
