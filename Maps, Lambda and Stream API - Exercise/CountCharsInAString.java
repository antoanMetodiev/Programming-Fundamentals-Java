import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.stream.Collectors;
public class CountCharsInAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.size(); i++) {

            String word = input.get(i);
            for (int j = 0; j < word.length(); j++) {

                char letter = word.charAt(j);

                if (!map.containsKey(letter)){
                    map.put(letter, 1);
                }
                else{
                   map.put(letter, map.get(letter) + 1);
                }
            }
        }
        // Печатаме:
        map.forEach((key, value) -> System.out.printf("%s -> %s\n", key, value));
    }
}
