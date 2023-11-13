import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine()
                .split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> soldierShip = Arrays.stream(scanner.nextLine()
                .split(">")).map(Integer::parseInt).collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());
        String action = scanner.nextLine();
        while (!action.equals("Retire")) {
            String[] arr = action.split(" ");
            String command = arr[0];
            if (command.equals("Fire")) {

                int index = Integer.parseInt(arr[1]);
                int power = Integer.parseInt(arr[2]);
                if (index >= 0 && index < soldierShip.size()) {

                    int setter = soldierShip.get(index) - power;
                    soldierShip.set(index, setter);
                    if (soldierShip.get(index) <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }
                }
            } else if (command.equals("Defend")) {

                int startIndex = Integer.parseInt(arr[1]);
                int endIndex = Integer.parseInt(arr[2]);
                int power = Integer.parseInt(arr[3]);
                if (checkIndexes(startIndex, endIndex, pirateShip)) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        int setter = pirateShip.get(i) - power;
                        pirateShip.set(i, setter);
                        if (pirateShip.get(i) <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                    }
                }
            } else if (command.equals("Repair")) {

                int index = Integer.parseInt(arr[1]);
                int plusHealth = Integer.parseInt(arr[2]);
                if (index >= 0 && index < pirateShip.size()) {
                    int temp = pirateShip.get(index) + plusHealth;
                    pirateShip.set(index, temp);
                    if (pirateShip.get(index) > maxHealth) {
                        pirateShip.set(index, maxHealth);
                    }
                }
            } else if (command.equals("Status")) {

                double minHealth = maxHealth * 0.20;
                int counter = 0;
                for (int i = 0; i < pirateShip.size(); i++) {
                    if (pirateShip.get(i) < minHealth) {
                        counter++;
                    }
                }
                System.out.printf("%d sections need repair.\n", counter);
            }
            action = scanner.nextLine();
        }
        if (!pirateShip.isEmpty() && !soldierShip.isEmpty()) {
            int pirateScores = calculateScores(pirateShip);
            System.out.printf("Pirate ship status: %d\n",pirateScores);
            int soldierScores = calculateScores(soldierShip);
            System.out.printf("Warship status: %d", soldierScores);
        }
    }

    private static boolean checkIndexes(int startIndex, int endIndex, List<Integer> pirateShip) {
        if (startIndex < 0 || startIndex >= pirateShip.size()) {
            return false;
        }
        if (endIndex < 0 || endIndex >= pirateShip.size()) { 
            return false;
        }
        return true;
    }

    private static int calculateScores(List<Integer> currentShip) {
        int sum = 0;
        for (int i = 0; i < currentShip.size(); i++) {
            sum += currentShip.get(i);
        }
        return sum;
    }
}
