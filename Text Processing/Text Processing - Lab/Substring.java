import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removedWord = scanner.nextLine();
        String input = scanner.nextLine();
        while (input.contains(removedWord)){
            input = deleteWord(input, removedWord);
        }
        System.out.println(input);
    }

    private static String deleteWord(String input, String removedWord) {
        int beginIndex = input.indexOf(removedWord);
        int endIndex = beginIndex + removedWord.length();
        String firstPart = input.substring(0, beginIndex);
        String secondPart = input.substring(endIndex);

        return firstPart + secondPart;
    }
}
