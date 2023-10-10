import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;
public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNum = Integer.parseInt(scanner.nextLine());
        char command = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());
        System.out.println(printSum(command, firstNum, secondNum));
    }

    private static int printSum(char command, int firstNum, int secondNum) {
        if (command == '+') {
            firstNum += secondNum;
        } else if (command == '-') {
            firstNum -= secondNum;
        } else if (command == '*') {
            firstNum *= secondNum;
        } else if (command == '/') {
            firstNum /= secondNum;
        }
        return firstNum;
    }
}
