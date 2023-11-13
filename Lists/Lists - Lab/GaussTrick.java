import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class GaussTrick {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        calculateListNumbers(numbers);
    }

    private static void calculateListNumbers(List<Integer> numbers) {
        int listNumbersSize = numbers.size() / 2;
        for (int i = 0; i < listNumbersSize; i++) {
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.get(numbers.size() - 1));
        }
        printListNumbers(numbers);
    }

    private static void printListNumbers(List<Integer> numbers) {
        int listNumbersSize = numbers.size();
        for (int i = 0; i < listNumbersSize; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

}
