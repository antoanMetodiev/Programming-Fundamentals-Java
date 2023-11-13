import java.util.*;
import java.util.stream.Collectors;
public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        List<String> words = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        Map<String, Integer> saver = new LinkedHashMap<>();
        for (String word : words) {

            if (!saver.containsKey(word)){
                saver.put(word, 1);
            }else{
                int index = saver.get(word) + 1;
                saver.put(word, index);
            }
        }

        List<String> resultSaver = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : saver.entrySet()) {

            if (entry.getValue() % 2 != 0){
                resultSaver.add(entry.getKey());
            }
        }

        for (int i = 0; i < resultSaver.size(); i++) {

            if (i == resultSaver.size() - 1){
                System.out.print(resultSaver.get(i));
                return;
            }
            System.out.print(resultSaver.get(i) + ", ");
        }
    }
}
