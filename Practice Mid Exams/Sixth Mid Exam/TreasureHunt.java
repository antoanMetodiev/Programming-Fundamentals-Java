import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class TreasureHunt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chest = Arrays.stream(scanner.nextLine()
                .split("\\|")).collect(Collectors.toList());

        String action = scanner.nextLine();
        while (!action.equals("Yohoho!")){
            String[] arr = action.split(" ");
            String command = arr[0];
            if (command.equals("Loot")){
                for (int i = 1; i < arr.length; i++) {
                    String object = arr[i];
                    if (chest.contains(object)){
                        continue;
                    }
                    chest.add(0,object);
                }
            } else if (command.equals("Drop")){
                int index = Integer.parseInt(arr[1]);
                if (index >= 0 && index < chest.size()){
                    String objectSaver = chest.get(index);
                    chest.remove(index);
                    chest.add(objectSaver);
                }
            } else if (command.equals("Steal")){
                int deletedEls = Integer.parseInt(arr[1]);
                if (deletedEls > chest.size()){
                    deletedEls = chest.size();
                }

                List<String> saveEls = new ArrayList<>();
                for (int i = 0; i < deletedEls; i++) {
                    int lastIndex = chest.size() - 1;
                    saveEls.add(0,chest.get(lastIndex));
                    chest.remove(lastIndex);
                }
                System.out.println(String.join(", ",saveEls));
            }
            action = scanner.nextLine();
        }
        if (chest.isEmpty()){
            System.out.println("Failed treasure hunt.");
            return;
        }

        double allLeters = 0;
        for (int i = 0; i < chest.size(); i++) {
            String currentWord = chest.get(i);
            for (int j = 0; j < currentWord.length(); j++) {
                allLeters++;
            }
        }
        allLeters /= chest.size();
        System.out.printf("Average treasure gain: %.2f pirate credits.", allLeters);
    }
}
