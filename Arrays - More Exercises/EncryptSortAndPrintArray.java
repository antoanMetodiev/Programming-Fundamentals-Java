import java.util.Scanner;
import java.util.Arrays;
public class EncryptSortAndPrintArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        int[] encryptedValues = new int[n];
        for (int i = 0; i < n; i++) {
            String currentName = names[i];
            int encryptedValue = 0;

            for (int j = 0; j < currentName.length(); j++) {
                char letter = currentName.charAt(j);

                if (isVowel(letter)) {
                    encryptedValue += letter * currentName.length();
                } else {
                    encryptedValue += letter / currentName.length();
                }
            }
            encryptedValues[i] = encryptedValue;
        }

        Arrays.sort(encryptedValues);
        for (int value : encryptedValues) {
            System.out.println(value);
        }
    }

    private static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}
