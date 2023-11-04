import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String regex = "\\+359([-| ])2(\\1)[0-9]{3}\\b(\\1)[0-9]{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numbers);
        List<String> collector = new ArrayList<>();
        while (matcher.find()) {
            collector.add("" + matcher.group());
        }
        System.out.println(collector
                .toString()
                .replaceAll("[\\[\\]]",""));
    }
}
