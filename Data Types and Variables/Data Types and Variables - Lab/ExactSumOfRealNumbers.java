import java.math.BigDecimal;
import java.util.Scanner;
public class ExactSumOfRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal allSum = new BigDecimal(0);
        for (int i = 1; i <= n ; i++){
           BigDecimal numbers = new BigDecimal(scanner.nextLine());
           allSum = allSum.add(numbers);
        }
        System.out.println(allSum);
    }
}
