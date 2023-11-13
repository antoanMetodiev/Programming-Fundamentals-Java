import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> chest = new LinkedHashMap<>();
        chest.put("shards", 0);
        chest.put("fragments", 0);
        chest.put("motes", 0);

        boolean isDone = false;
        while (true){

            String[] data = scanner.nextLine().toLowerCase().split("\\s+");
            for (int i = 0; i < data.length;) {

                int quantity = Integer.parseInt(data[i]);
                String item = data[i + 1];
                i += 2;

                chest.putIfAbsent(item, 0);
                chest.put(item, chest.get(item) + quantity);
                if ((item.equals("shards") || item.equals("fragments") || item.equals("motes")) && chest.get(item) >= 250){
                    isDone = true;
                    break;
                }
            }
            if (isDone){
                break;
            }
        }
        finalChecks(chest);
    }

    private static void finalChecks(Map<String, Integer> chest) {

        for (Map.Entry<String, Integer> entry : chest.entrySet()) {

            if (entry.getKey().equals("fragments") && entry.getValue() >= 250){
                System.out.println("Valanyr obtained!");
                chest.put(entry.getKey(), entry.getValue() - 250);
                chest.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
                return;
            }
            else if (entry.getKey().equals("shards") && entry.getValue() >= 250){
                System.out.println("Shadowmourne obtained!");
                chest.put(entry.getKey(), entry.getValue() - 250);
                chest.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
                return;
            }
            else if (entry.getKey().equals("motes") && entry.getValue() >= 250){
                System.out.println("Dragonwrath obtained!");
                chest.put(entry.getKey(), entry.getValue() - 250);
                chest.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
                return;
            }
        }
    }
}
