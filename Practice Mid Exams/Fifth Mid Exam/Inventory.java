import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Inventory{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());

        String action = scanner.nextLine();
        while (!action.equals("Craft!")){
            String[] arr = action.split(" ");
            String command = arr[0];
            if (command.equals("Collect")){
                String object = arr[2];
                if (!items.contains(object)){
                    items.add(object);
                }
            } else if (command.equals("Drop")){
                items.remove(arr[2]);
            } else if (command.equals("Combine")){
                String[] els = arr[3].split(":");
                String lastObject = els[0];
                String newObject = els[1];

                if (items.contains(lastObject)){
                    int index = items.indexOf(lastObject) + 1;
                    items.add(index, newObject);
                }
            } else if (command.equals("Renew")){
                String object = arr[2];
                if (items.contains(object)){
                    items.remove(object);
                    items.add(object);
                }
            }
            action = scanner.nextLine();
        }
        System.out.println(String.join(", ",items));
    }
}
