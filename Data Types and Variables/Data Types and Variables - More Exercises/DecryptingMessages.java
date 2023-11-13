import java.util.Scanner;
public class DecryptingMessages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int temp = key;

        for (int i = 0; i < n; i++) {
            char input = scanner.nextLine().charAt(0);
            key += input;
            System.out.printf("%c",key);
            key = temp;
        }
    }
}
