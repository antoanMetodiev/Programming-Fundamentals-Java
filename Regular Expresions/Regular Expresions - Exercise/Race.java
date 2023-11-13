import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine()
                .split(",\\s+")).collect(Collectors.toList());

        Map<String, Integer> data = new LinkedHashMap<>();
        for (String name : names) {
            data.putIfAbsent(name, 0);
        }
        Pattern letterRegex = Pattern.compile("[A-Za-z]+");
        Pattern digitsRegex = Pattern.compile("[0-9]");

        String line = scanner.nextLine();
        while (!line.equals("end of race")){

            Matcher letterMatcher = letterRegex.matcher(line);
            String currentName = "";
            while (letterMatcher.find()){
                currentName += "" + letterMatcher.group();
            }

            Matcher digitsMatcher = digitsRegex.matcher(line);
            int points = 0;
            while (digitsMatcher.find()){
                points += Integer.parseInt(digitsMatcher.group());
            }
            if (data.containsKey(currentName)){
                int oldScore = data.get(currentName);
                int newScore = oldScore + points;
                data.put(currentName, newScore);
            }
            line = scanner.nextLine();
        }
        List<Integer> collectValues = new ArrayList();
        for (int value : data.values()) {
           collectValues.add(value);
        }

        int repeatCounter = 0;
        for (int i = 0; i < data.size(); i++) {

            int maxValue = Collections.max(collectValues);
            for (Map.Entry<String, Integer> entry: data.entrySet()) {

                if (repeatCounter == 3){
                    return;
                }
                if (entry.getValue() == maxValue){

                    repeatCounter++;
                    int place = repeatCounter;
                    if (place == 1){
                        System.out.printf("%dst place: %s\n",place, entry.getKey());
                    } else if (place == 2){
                        System.out.printf("%dnd place: %s\n",place, entry.getKey());
                    } else {
                        System.out.printf("%drd place: %s\n",place, entry.getKey());
                    }
                    data.remove(entry.getKey());
                    int index = collectValues.indexOf(maxValue);
                    collectValues.remove(index);
                    i--;
                    break;
                }
            }
        }
    }
}
