import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> saveArrivals = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split("\\s+");
            if (command[1].equals("is") && command[2].equals("going!")){
                if (saveArrivals.contains(command[0])){
                    System.out.println(command[0] + " is already in the list!");
                    continue;
                }
                saveArrivals.add(command[0]);
            }
            else if (command[1].equals("is") && command[2].equals("not") && command[3].equals("going!")){
                if (saveArrivals.contains(command[0])){
                    saveArrivals.remove(command[0]);
                    continue;
                }
                System.out.println(command[0] + " is not in the list!");
            }
        }
        saveArrivals.forEach(el-> System.out.println(el));
    }
}
