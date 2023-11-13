import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;
public class TopIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e-> Integer.parseInt(e)).toArray();

        for (int i = 0; i < numbers.length - 1; i++) {

            boolean flag1 = false;
            for (int j = i; j < numbers.length - 1; j++) {

                if (!(numbers[i] > numbers[j + 1])){
                    flag1 = true;
                    break;
                }
            }
            if (!flag1){
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println(numbers[numbers.length - 1]);
    }
}
