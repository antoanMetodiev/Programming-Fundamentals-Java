import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class EqualSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int i = 0;
        for (i = 0; i <= numbers.length - 1; i++) {

            if (numbers.length == 1){
                System.out.println("0");
                return;
            }
            int rightSum = 0;
            int leftSum = 0;

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                rightSum += numbers[j];
            }
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            if (rightSum == leftSum){
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
