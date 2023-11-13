import java.awt.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class ListManipulationBasics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            products.add(scanner.nextLine());
        }
        Collections.sort(products);
        printProducts(products,n);
    }

    private static void printProducts(List<String> products,int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d.%s\n",i,products.get(i - 1));
        }
    }
}
