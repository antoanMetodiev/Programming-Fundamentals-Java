import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine()
                .split("!")).collect(Collectors.toList());
        String actions = scanner.nextLine();
        while (!actions.equals("Go Shopping!")){

            String[] arr = actions.split(" ");
            String command = arr[0];
            if (command.equals("Urgent")){
                String object = arr[1];
                if (!products.contains(object)){
                    products.add(0,object);
                }
            } else if (command.equals("Unnecessary")){
                String object = arr[1];
                products.remove(object);
            } else if (command.equals("Correct")){

                String oldProduct = arr[1];
                String newProduct = arr[2];
                if (products.contains(oldProduct)){

                    int index = products.indexOf(oldProduct);
                    products.set(index,newProduct);
                }
            } else if (command.equals("Rearrange")){

                String object = arr[1];
                if (products.contains(object)){
                    products.remove(object);
                    products.add(object);
                }
            }
            actions = scanner.nextLine();
        }
        System.out.println(String.join(", ",products));
    }
}
