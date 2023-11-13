import java.util.Scanner;
public class Orders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double count = Integer.parseInt(scanner.nextLine());
        double calculateSum = calculateSum(product,count);
        System.out.printf("%.2f",calculateSum);
    }

    private static double calculateSum(String product, double count) {
        if (product.equals("coffee")){
            count *= 1.50;
        }
        else if (product.equals("water")){
            count *= 1.00;
        }
        else if (product.equals("coke")){
            count *= 1.40;
        }
        else if (product.equals("snacks")){
            count *= 2.00;
        }
        return count;
    }
}
