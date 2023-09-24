import java.util.Arrays;
import java.util.Scanner;
public class CondenseArrayToNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();

        while (numbers.length > 1){
            int[] saver = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                saver[i] = numbers[i] + numbers[i + 1];
            }
            numbers = saver;
        }
        System.out.println(numbers[0]);
    }
}
