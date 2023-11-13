import java.util.Scanner;
public class SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num ; i++){

            int special = i;
            int allSum = 0;
            for (int j = 0; j <= num ; j++){

                int number = special % 10;
                allSum += number;
                special /= 10;
                if (special == 0){
                    break;
                }
            }
            if (allSum == 7 || allSum == 11 || allSum == 5){
                System.out.printf("%d -> True\n",i);
            }
            else{
                System.out.printf("%d -> False\n",i);
            }
        }
    }
}
