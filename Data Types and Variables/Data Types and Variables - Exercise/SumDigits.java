import java.util.Scanner;
public class SumDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        short allSum = 0;
        String text = "" + number;
        int special = number;
        for (int i = 0; i < text.length(); i++){

            special = number % 10;
            allSum += (short)special;
            number /= 10;
        }
        System.out.println(allSum);
    }
}
