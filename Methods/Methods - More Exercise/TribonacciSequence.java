import java.util.Scanner;
public class TribonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printTribonacciSequence(num);
    }

    private static void printTribonacciSequence(int num){
        int[] numbers = {1,1,2,4};
        if (num < 5){
            for (int i = 0; i < num; i++) {
                System.out.print(numbers[i] + " ");
            }
            return;
        }
        int[] arrNumbers = new int[num];
        for (int i = 0; i < 4; i++) {
            arrNumbers[i] = numbers[i];
        }

        int sum = 0;
        for (int i = 4; i < num; i++) {
            arrNumbers[i] = arrNumbers[i - 1] + arrNumbers[i - 2] + arrNumbers[i - 3];
        }

        for (int i = 0; i < num; i++) {
            System.out.print(arrNumbers[i] + " ");
        }
    }
}
