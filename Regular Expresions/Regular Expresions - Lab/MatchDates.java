import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dates = scanner.nextLine();

        String regex = "\\b(?<day>[0-9]\\d)([\\/\\.-])\\b(?<month>[A-Z][a-z]{2})\\2(?<year>[1-9]\\d{3})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dates);
        while (matcher.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s\n",
                    matcher.group("day"),
                    matcher.group("month"),matcher.group("year"));
        }
    }
}
