import java.util.*;
public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Double>> collector = new LinkedHashMap<>();
        while (!input.equals("buy")){

            String[] data = input.split("\\s+");
            String product = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            if (!collector.containsKey(product)){
                collector.put(product, new ArrayList<>());
                collector.get(product).add(price);
                collector.get(product).add(quantity);
            } else{
                collector.get(product).set(0, price);
                collector.get(product).set(1, collector.get(product).get(1) + quantity);
            }
            input = scanner.nextLine();
        }
        collector.forEach((key, value) -> System.out
                .printf("%s -> %.2f\n", key, value.get(0) * value.get(1)));
    }
}
