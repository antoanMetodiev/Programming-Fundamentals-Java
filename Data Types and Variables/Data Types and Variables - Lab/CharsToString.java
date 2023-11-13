import java.util.Scanner;
public class CharsToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        String all = "" + a + b + c;
        System.out.println(all);
    }
}
