import java.awt.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulationBasics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        checkCommandManipulation(numbers,scanner);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

    private static List<Integer> checkCommandManipulation(List<Integer> numbers,Scanner scanner) {

        String command = scanner.nextLine();
        while(!command.equals("end")) {

            String[] saver = command.split(" ");
            if (saver[0].equals("Add")){
                int num = Integer.parseInt(saver[1]);
              numbers.add(num);
            }
            else if (saver[0].equals("Remove")){
                int num = Integer.parseInt(saver[1]);
                numbers.remove(Integer.valueOf(num));
            }
            else if (saver[0].equals("RemoveAt")){
                int index = Integer.parseInt(saver[1]);
                numbers.remove(index);
            }
            else if (saver[0].equals("Insert")){
                int num = Integer.parseInt(saver[1]);
                int index = Integer.parseInt(saver[2]);
                numbers.add(index,num);
            }
            command = scanner.nextLine();
        }
        return numbers;
    }
}
