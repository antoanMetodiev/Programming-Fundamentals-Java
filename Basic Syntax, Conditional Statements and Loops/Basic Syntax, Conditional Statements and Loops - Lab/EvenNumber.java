import java.util.Scanner;
public class EvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){

            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0){

                if (number <= 0){
                    number = Math.abs(number);
                }
                System.out.printf("The number is: %d",number);
                return;
            }
            else{
                System.out.println("Please write an even number.");
            }
        }
    }
}
