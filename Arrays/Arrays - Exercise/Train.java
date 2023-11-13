import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] peoples = new int [n];

        int sum = 0;
        for (int i = 0; i < peoples.length; i++) {
            peoples[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(peoples[i] + " ");
            sum += peoples[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
