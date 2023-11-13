import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(#|\\|)(?<product>[a-zA-z\\s+]+)\\1(?<date>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(?<calories>[\\d]{1,5})\\1");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        List<String> collector = new ArrayList<>();
        int totalCalories = 0;
        while (matcher.find()){
            collector.add(matcher.group("product"));
            collector.add(matcher.group("date"));
            collector.add(matcher.group("calories"));
            totalCalories += Integer.parseInt(matcher.group("calories"));
        }
        int dayCounter = 0;
        while (totalCalories > 0){
            dayCounter++;
            totalCalories -= 2000;
            if (totalCalories < 0){
                dayCounter--;
            }
        }
        System.out.printf("You have food to last you for: %d days!\n", dayCounter);
        while (!collector.isEmpty()){
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s\n",collector.get(0), collector.get(1), collector.get(2));
            collector.remove(0);
            collector.remove(0);
            collector.remove(0);
        }
    }
}
