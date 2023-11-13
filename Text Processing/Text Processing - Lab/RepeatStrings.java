import java.util.*;
import java.util.stream.Collectors;
public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> data = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());
        data.forEach(e -> {
            for (int i = 0; i < e.length(); i++) {
                System.out.print(e);
            }
        });
    }
}
