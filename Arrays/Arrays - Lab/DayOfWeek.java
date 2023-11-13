import java.util.Scanner;
public class DayOfWeek {

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int input = Integer.parseInt(scanner.nextLine());
       String[] dayOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

       if (input >= 1 && input <= 7){
           int day = input - 1;
           System.out.println(dayOfWeek[day]);
       }else{
           System.out.println("Invalid day!");
       }
    }
}
