import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = text.length() - 1; i >= 0 ; i--){

            char a = text.charAt(i);
            System.out.print(a);
        }
    }
}
