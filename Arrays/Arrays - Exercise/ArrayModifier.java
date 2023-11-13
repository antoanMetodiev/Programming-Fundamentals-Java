import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayModifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")){

            if (command[0].equals("swap")){
                String lastIndex = command[command.length - 1];
                String lastIndex2 = command[command.length - 2];
                int parseLastIndex = Integer.parseInt(lastIndex);
                int parse2LastIndex = Integer.parseInt(lastIndex2);

                int saver = numbers[parse2LastIndex];
                numbers[parse2LastIndex] = numbers[parseLastIndex];
                numbers[parseLastIndex] = saver;
            }
            else if (command[0].equals("multiply")){

                String lastIndex = command[command.length - 1];
                String lastIndex2 = command[command.length - 2];
                int parseLastIndex = Integer.parseInt(lastIndex);
                int parse2LastIndex = Integer.parseInt(lastIndex2);

                int saver = numbers[parse2LastIndex];
                numbers[parse2LastIndex] = numbers[parse2LastIndex] * numbers[parseLastIndex];
            }
            else if (command[0].equals("decrease")){

                for (int i = 0; i < numbers.length ; i++) {
                    numbers[i] = numbers[i] - 1;
                }
            }
            command = scanner.nextLine().split(" ");
        }
        String[] output = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            output[i] = String.valueOf(numbers[i]);
        }
        System.out.println(String.join(", ",output));
    }
}
