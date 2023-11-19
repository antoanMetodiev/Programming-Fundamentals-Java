import java.util.Scanner;
public class MultiplicationSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        checkNumbers(num1,num2,num3);
    }
    private static void checkNumbers(int num1,int num2,int num3){
        int counter = 0;
        int[] numbers = {num1,num2,num3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                counter++;
            }
            if (numbers[i] == 0){
                System.out.println("zero");
                return;
            }
        }
        if (counter % 2 == 0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
