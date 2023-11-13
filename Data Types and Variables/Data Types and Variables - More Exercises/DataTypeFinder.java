import java.util.Scanner;
public class DataTypeFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            }

            if (input.matches("-?\\d+")) {
                System.out.println(input + " is integer type");
            } else if (input.matches("-?\\d+\\.\\d+")) {
                System.out.println(input + " is floating point type");
            } else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.println(input + " is boolean type");
            } else if (input.length() == 1) {
                System.out.println(input + " is character type");
            } else {
                System.out.println(input + " is string type");
            }
        }
    }
}
