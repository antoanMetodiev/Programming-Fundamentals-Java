import java.util.Scanner;
public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int totalEmployee = firstEmployee + secondEmployee + thirdEmployee;

        int waitingPeoples = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        while (waitingPeoples > 0){
            hours++;
            if (hours % 4 == 0){
                continue;
            }
            waitingPeoples -= totalEmployee;
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
