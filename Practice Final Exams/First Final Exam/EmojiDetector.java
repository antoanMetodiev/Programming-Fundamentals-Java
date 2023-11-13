import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> names = new ArrayList<>();
        Pattern firstPattern = Pattern.compile("(::|\\*\\*)[A-Z][a-z]{2,}\\1");
        Matcher matcher1 = firstPattern.matcher(input);
        while (matcher1.find()) {
            names.add(matcher1.group());
        }

        List<Integer> digits = new ArrayList<>();
        Pattern secondPattern = Pattern.compile("\\d");
        Matcher matcher2 = secondPattern.matcher(input);
        while (matcher2.find()) {
            digits.add(Integer.parseInt(matcher2.group()));
        }

        int threshold = 0;
        int counter = 0;
        for (int digit : digits) {
            counter++;
            if (counter == 1) {
                threshold += 1 * digit;
                continue;
            }
            threshold = threshold * digit;
        }

        System.out.printf("Cool threshold: %d\n", threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", names.size());
        for (String name : names) {

            int result = 0;
            for (int i = 0; i < name.length(); i++) {
                char symbol = name.charAt(i);
                if (symbol != 42 && symbol != 58) {
                    result += name.charAt(i);
                }
            }
            if (result > threshold){
                System.out.println(name);
            }
        }
    }
}
