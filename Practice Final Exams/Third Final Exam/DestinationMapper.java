import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(=|\\/)[A-Z][A-Za-z]{2,}\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();
        while (matcher.find()) {
            destinations.add(matcher.group());
        }
        int allLenght = 0;
        for (int i = 0; i < destinations.size(); i++) {
            String updatedText = destinations.get(i).replaceAll("=|\\/", "");
            destinations.remove(i);
            destinations.add(i, updatedText);
            allLenght += destinations.get(i).length();
        }
        System.out.print("Destinations: ");
        System.out.print(String.join(", ", destinations));
        System.out.println();
        System.out.printf("Travel Points: %s", allLenght);
    }
}
