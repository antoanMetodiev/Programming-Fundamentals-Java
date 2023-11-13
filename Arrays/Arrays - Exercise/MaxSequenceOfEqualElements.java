import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class MaxSequenceOfEqualElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int bestStartIndex = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i - 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    bestStartIndex = startIndex;
                }
            }
            else {
                currentLength = 1;
                startIndex = i;
            }
        }
        for (int i = bestStartIndex; i < bestStartIndex + maxLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
