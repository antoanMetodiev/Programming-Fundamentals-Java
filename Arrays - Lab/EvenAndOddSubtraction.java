import java.util.Arrays;
import java.util.Scanner;
public class EvenAndOddSubtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                evenNumbers += numbers[i];
            }
            else{
                oddNumbers += numbers[i];
            }
        }
        System.out.println(evenNumbers - oddNumbers);
    }
}
