import java.util.Scanner;
public class ConcatNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
        String lName = scanner.nextLine();
        String symbols = scanner.nextLine();
        System.out.printf("%s%s%s",fName,symbols,lName);
    }
}
