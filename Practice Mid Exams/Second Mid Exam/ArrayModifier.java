import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String actions = scanner.nextLine();

        while (!actions.equals("end")){
            String[] arr = actions.split("\\s+");
            String command = arr[0];
            if (command.equals("swap")){
                int firstIndex = Integer.parseInt(arr[1]);  
                int secondIndex = Integer.parseInt(arr[2]); 
                int firstObj = numbers.get(firstIndex);
                int secondObj = numbers.get(secondIndex);

                numbers.set(firstIndex,secondObj);
                numbers.set(secondIndex,firstObj);
            } else if (command.equals("multiply")){
                int firstIndex = Integer.parseInt(arr[1]);
                int secondIndex = Integer.parseInt(arr[2]);
                int obj = numbers.get(firstIndex) * numbers.get(secondIndex);
                numbers.set(firstIndex,obj);
            }else if (command.equals("decrease")){
                for (int i = 0; i < numbers.size(); i++) {
                    numbers.set(i,numbers.get(i) - 1);
                }
            }
            actions = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1){
                System.out.print(numbers.get(i));
                return;
            }
            System.out.print(numbers.get(i) + ", ");
        }
    }
}
