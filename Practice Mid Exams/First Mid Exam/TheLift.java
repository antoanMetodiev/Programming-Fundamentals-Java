import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class TheLift{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeoples = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < wagons.size(); i++) {
            for (int j = 1; j <= 4; j++) {

                if (waitingPeoples == 0){
                    break;
                }
                if (wagons.get(i) < 4){
                    wagons.set(i,wagons.get(i) + 1);
                    waitingPeoples--;
                } else if (wagons.get(i) >= 4){
                    break;
                }
            }
        }

        if (waitingPeoples == 0 && checkForFreeSeats(wagons)){
            System.out.println("The lift has empty spots!");
            wagons.forEach(e->System.out.print(e + " "));
            return;
        }
        else if (waitingPeoples > 0 && !checkForFreeSeats(wagons)){
            System.out.printf("There isn't enough space! %d people in a queue!\n", waitingPeoples);
            wagons.forEach(e->System.out.print(e + " "));
            return;
        }
        wagons.forEach(e->System.out.print(e + " "));
    }

    private static boolean checkForFreeSeats(List<Integer> wagons) {
        for (int i = 0; i < wagons.size(); i++) {
            if (wagons.get(i) < 4){
                return true;
            }
        }
        return false;
    }
}
