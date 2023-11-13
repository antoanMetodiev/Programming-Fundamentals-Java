import java.util.Scanner;
public class LowerOrUpper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        if (symbol1 >= 65 && symbol1 <= 90){
            System.out.println("upper-case");
        }
        else if (symbol1 >= 97 && symbol1 <= 122){
            System.out.println("lower-case");
        }
    }
}
