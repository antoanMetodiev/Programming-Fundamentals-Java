import java.util.Scanner;
public class SumofOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int allsum = 0;
        int counter = 1;

        for (int i = 1; i <= num ; i++){

            if (counter % 2 != 0){
                System.out.println(counter);
                allsum += counter;
            }
            counter += 2;
        }
        System.out.printf("Sum: %d",allsum);
    }
}