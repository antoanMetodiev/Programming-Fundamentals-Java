import java.util.Scanner;
public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(",\\s+");
        String text = scanner.nextLine();
        for (int i = 0; i < bannedWords.length; i++) {

            while (text.contains(bannedWords[i])){
                String stars = "";
                for (int j = 0; j < bannedWords[i].length(); j++) {
                    stars += "*";
                }
                text = text.replace(bannedWords[i], stars);
            }
        }
        System.out.println(text);
    }
}
