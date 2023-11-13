import java.util.Scanner;
public class RefactorSpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; i++){

            short allSum = 0;
            short special = (short)i;
            while(special > 0){
                allSum += special % 10;
                special /= 10;
            }
            if (allSum == 7 || allSum == 5 || allSum == 11){
                System.out.printf("%d -> True\n",i);
            }
            else{
                System.out.printf("%d -> False\n",i);
            }
        }
    }
}
