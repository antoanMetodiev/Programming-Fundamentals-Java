import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        double price = 0;
        List<String> furnitures = new ArrayList<>();
        while (!text.equals("Purchase")){

            Pattern pattern = Pattern.compile(">>\\b(?<furnitureName>[A-Za-z]+)\\b<<(?<price>[1-9][0-9]{0,}(\\.)?([1-9][0-9]*)?)!(?<quantity>\\d+)\\b");
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){

                int quantity = Integer.parseInt(matcher.group("quantity"));
                double furniturePrice = Double.parseDouble(matcher.group("price"));
                price += furniturePrice * quantity;
                furnitures.add(matcher.group("furnitureName"));
            }
            text = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitures.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", price);
    }
}
