import java.util.Arrays;
import java.util.Scanner;
public class SmallestOfThreeNumbers{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int firstNum = Integer.parseInt(scanner.nextLine());
       int secondNum = Integer.parseInt(scanner.nextLine());
       int thirdNum = Integer.parseInt(scanner.nextLine());
       findSmallestNum(firstNum,secondNum,thirdNum);
    }
    
    private static void findSmallestNum(int firstNum,int secondNum,int thirdNum){
        int[] numbers = {firstNum,secondNum,thirdNum};
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
    }
}