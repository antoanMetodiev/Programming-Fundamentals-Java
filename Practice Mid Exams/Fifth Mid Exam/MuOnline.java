import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> rooms = Arrays.stream(scanner.nextLine()
                .split("\\|")).collect(Collectors.toList());

        int maxHealth = 100;
        int allBitcoins = 0;
        int bestRoom = 0;
        for (int i = 0; i < rooms.size(); i++) {
            bestRoom++;
            String[] arr = rooms.get(i).split(" ");
            String command = arr[0];
            if (command.equals("potion")){

                int currentHealht = maxHealth;
                int moreHealth = Integer.parseInt(arr[1]);
                maxHealth += moreHealth;
                if (maxHealth > 100){
                    maxHealth = 100;
                }
                currentHealht = maxHealth - currentHealht;
                System.out.printf("You healed for %d hp.\n", currentHealht);
                System.out.printf("Current health: %d hp.\n", maxHealth);
                continue;
            } else if (command.equals("chest")){
                int bitcoins = Integer.parseInt(arr[1]);
                allBitcoins += bitcoins;
                System.out.printf("You found %d bitcoins.\n", bitcoins);
                continue;
            }
            String monster = arr[0];
            int damage = Integer.parseInt(arr[1]);
            maxHealth -= damage;
            if (maxHealth > 0){
                System.out.printf("You slayed %s.\n", monster);
            } else {
                System.out.printf("You died! Killed by %s.\n",monster);
                System.out.printf("Best room: %d", bestRoom);
                return;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n", allBitcoins);
        System.out.printf("Health: %d", maxHealth);
    }
}