import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int allSum = 0;
        for (int i = 0; i < input.length; i++) {

            if (input[i] % 2 == 0){
                allSum += input[i];
            }
        }
        System.out.println(allSum);
    }
}
