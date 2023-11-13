import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;
public class MagicSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i; j < numbers.length - 1; j++) {

                if (numbers[i] + numbers[j + 1] == rotations){
                    System.out.println(numbers[i] + " " + numbers[j + 1]);
                }
            }
        }
    }
}
