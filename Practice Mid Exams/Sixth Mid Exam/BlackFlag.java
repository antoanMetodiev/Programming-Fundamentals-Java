import java.util.Scanner;
public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int daySteal = Integer.parseInt(scanner.nextLine());
        double expectedSteal = Double.parseDouble(scanner.nextLine());

        double stealed = 0;
        for (int i = 1; i <= days; i++) {
            stealed += daySteal;
            if (i % 3 == 0){
                stealed += daySteal * 0.50;
            }
            if (i % 5 == 0){
                stealed -= stealed * 0.30;
            }
        }
        if (stealed >= expectedSteal){
            System.out.printf("Ahoy! %.2f plunder gained.\n", stealed);
        }else{
            double percent = (stealed / expectedSteal) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }
    }
}
