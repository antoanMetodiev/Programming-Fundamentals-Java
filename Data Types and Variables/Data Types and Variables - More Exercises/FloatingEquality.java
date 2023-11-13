import java.util.Scanner;
public class FloatingEquality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double esp = 0.000001;

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        boolean diff = Math.abs(firstNum - secondNum) < esp;
        if (diff){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
