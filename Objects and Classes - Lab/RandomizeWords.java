import java.util.*;
import java.util.stream.Collectors;
public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int indexes = input.size();
        Random randomNum = new Random();
        List<String> saver = new ArrayList<>();
        for (int i = 0; i < indexes; i++) {
            int randomIndex = randomNum.nextInt(indexes);
            if (saver.contains(input.get(randomIndex))){
                i--;
                continue;
            }
            saver.add(input.get(randomIndex));
        }
        printSaverList(saver);
    }

    private static void printSaverList(List<String> saver) {
        for (int i = 0; i < saver.size(); i++) {
            System.out.println(saver.get(i));
        }
    }
}
