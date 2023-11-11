import java.math.BigInteger;
import java.util.Scanner;
public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new BigInteger(scanner.nextLine()).add(new BigInteger(scanner.nextLine())));
    }
}
