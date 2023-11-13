import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>();
        while (!command.equals("stop")){
            int value = Integer.parseInt(scanner.nextLine());

            map.putIfAbsent(command, 0);
            map.put(command, map.get(command) + value);

            command = scanner.nextLine();
        }
        map.forEach((key, value) -> System.out.printf("%s -> %d\n", key, value));
    }
}
