import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class TheLift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peoples = Integer.parseInt(scanner.nextLine());
        int[] liftCondition = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(value -> Integer.parseInt(value)).toArray();

        for (int i = 0; i < liftCondition.length; i++) {

               if (liftCondition[i] > 0){

                   peoples += liftCondition[i];
                   liftCondition[i] = 0;
               }
              liftCondition[i] = 4;
              if (peoples < liftCondition[i]){

                  liftCondition[i] = peoples;
                  peoples = 0;
                  break;
              }
              peoples -= liftCondition[i];
        }

        int counter = 0;
        for (int i = 0; i < liftCondition.length; i++) {
            if (liftCondition[i] == 4){
                counter++;
            }
        }
        if (peoples == 0 && counter == liftCondition.length){

            for (int i = 0; i < liftCondition.length; i++) {
                System.out.printf(liftCondition[i] + " ");
            }
        }
        else if(peoples == 0 && counter != 4){

            System.out.println("The lift has empty spots!");
            for (int i = 0; i < liftCondition.length; i++) {
                System.out.printf(liftCondition[i] + " ");
            }
        }
        else if (peoples != 0 && counter == liftCondition.length){

            System.out.printf("There isn't enough space! %d people in a queue!\n",peoples);
            for (int i = 0; i < liftCondition.length; i++) {
                System.out.printf(liftCondition[i] + " ");
            }
        }
    }
}
