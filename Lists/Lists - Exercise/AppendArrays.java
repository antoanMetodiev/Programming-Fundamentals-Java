import java.util.Scanner;
public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split("\\s*\\|\\s*");

        for (int i = numbers.length - 1; i >= 0; i--) {

            String[] arr = numbers[i].split("\\s+");

            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[j] + " ");
            }
        }
    }
}
