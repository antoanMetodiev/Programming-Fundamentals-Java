import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> els = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int moves = 0;
        while (!command.equals("end")){

            String[] arr = command.split("\\s+");
            moves++;
            int firstIndex = Integer.parseInt(arr[0]);
            int secondIndex = Integer.parseInt(arr[1]);
            boolean checker = checkIndexes(firstIndex,secondIndex,els);
            if (!checker){
                int middleIndex = els.size() / 2;
                String object = String.format("-%da",moves);
                els.add(middleIndex,object);
                els.add(middleIndex,object);
                System.out.println("Invalid input! Adding additional elements to the board");
                command = scanner.nextLine();
                continue;
            }
            String firstObject = els.get(firstIndex);
            String secondObject = els.get(secondIndex);
            if (!firstObject.equals(secondObject)){
                System.out.println("Try again!");
                command = scanner.nextLine();
                continue;
            } else{
                System.out.printf("Congrats! You have found matching elements - %s!\n", firstObject);
                els.remove(firstObject);
                els.remove(firstObject);
            }

            if (els.isEmpty()){
                System.out.printf("You have won in %d turns!", moves);
                return;
            }
            command = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", els));
    }

    private static boolean checkIndexes(int firstIndex, int secondIndex,List<String> els) {
        if (firstIndex < 0 || firstIndex >= els.size()){
            return false;
        }
        if (secondIndex < 0 || secondIndex >= els.size()){
            return false;
        }
        if (firstIndex == secondIndex){
            return false;
        }
        return true;
    }
}
