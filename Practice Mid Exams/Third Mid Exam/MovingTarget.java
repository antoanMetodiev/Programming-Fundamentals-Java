import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MovingTarget{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String actions = scanner.nextLine();
        while (!actions.equals("End")){

            String[] arr = actions.split("\\s+");
            String command = arr[0];
            int index = Integer.parseInt(arr[1]);
            int power = Integer.parseInt(arr[2]);
            if (command.equals("Shoot")){

                if (index >= 0 && index < numbers.size()){
                    int setter = numbers.get(index) - power;
                    numbers.set(index,setter);
                    if (numbers.get(index) <= 0){
                        numbers.remove(index);
                    }
                }
            } else if (command.equals("Strike")){
                removeEls(numbers,index, power);
            } else if (command.equals("Add")){

                if (index >= 0 && index < numbers.size()){
                    numbers.add(index, power);
                }else{
                    System.out.println("Invalid placement!");
                }
            }
            actions = scanner.nextLine();
        }
        printNumbersList(numbers);
    }

    private static void removeEls(List<Integer> numbers, int index, int power) {
        int start = index - power;
        int end = index + power;
        if (start < 0 || start >= numbers.size()){
            System.out.println("Strike missed!");
            return;
        }
        if (end < 0 || end >= numbers.size()){
            System.out.println("Strike missed!");
            return;
        }
        for (int i = start; i <= end; i++) {
            numbers.remove(start);
        }
    }

    private static void printNumbersList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1){
                System.out.print(numbers.get(i));
                return;
            }
            System.out.print(numbers.get(i) + "|");
        }
    }
}
