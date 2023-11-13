import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        String input = scanner.nextLine();
        String[] initialNumbers = input.split(" ");
        for (String num : initialNumbers) {
            numbers.add(Integer.parseInt(num));
        }

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }

            String[] tokens = command.split(" ");
            String action = tokens[0];

            switch (action) {
                case "Contains":
                    int numberToCheck = Integer.parseInt(tokens[1]);
                    if (numbers.contains(numberToCheck)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (tokens[1].equals("even")) {
                        printEven(numbers);
                    } else if (tokens[1].equals("odd")) {
                        printOdd(numbers);
                    }
                    break;
                case "Get":
                    if (tokens[1].equals("sum")) {
                        int sum = getSum(numbers);
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    String condition = tokens[1];
                    int filterNumber = Integer.parseInt(tokens[2]);
                    filterAndPrint(numbers, condition, filterNumber);
                    break;
            }
        }
    }

    private static void printEven(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printOdd(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    private static void filterAndPrint(List<Integer> numbers, String condition, int filterNumber) {
        for (int num : numbers) {
            switch (condition) {
                case ">":
                    if (num > filterNumber) {
                        System.out.print(num + " ");
                    }
                    break;
                case ">=":
                    if (num >= filterNumber) {
                        System.out.print(num + " ");
                    }
                    break;
                case "<":
                    if (num < filterNumber) {
                        System.out.print(num + " ");
                    }
                    break;
                case "<=":
                    if (num <= filterNumber) {
                        System.out.print(num + " ");
                    }
                    break;
            }
        }
        System.out.println();
    }
}
