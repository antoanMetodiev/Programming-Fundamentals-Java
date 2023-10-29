import java.util.*;
public class WordSynonyms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonyms.containsKey(word)){

                List<String> list = new ArrayList<>();
                list.add(synonym);
                synonyms.put(word, list);
            }
            else {

                List<String> list = synonyms.get(word);
                list.add(synonym);
                synonyms.put(word, list);
            }

        }

        for (Map.Entry<String, List<String>> map : synonyms.entrySet()) {

            System.out.printf("%s - %s\n", map.getKey(), String.join(", ", map.getValue()));
        }
    }
}
