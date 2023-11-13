import java.util.Scanner;
public class Snowballs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = Byte.parseByte(scanner.nextLine());
        short maxNum = Short.MIN_VALUE;
        double result = 0;

        short NewsnowballSnow = 0;
        short NewsnowballTime = 0;
        byte NewsnowballQuality = 0;

        for (int i = 1; i <= n ; i++){

            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime  = Short.parseShort(scanner.nextLine());
            byte snowballQuality = Byte.parseByte(scanner.nextLine());

             result = (short)((snowballSnow / snowballTime));
            result = Math.pow(result,  snowballQuality);
            if (result > maxNum){

                maxNum = (short) result;
                NewsnowballSnow = snowballSnow;
                NewsnowballTime = snowballTime;
                NewsnowballQuality = snowballQuality;
            }
        }
        result = (short)((NewsnowballSnow / NewsnowballTime));
        result = Math.pow(result,  NewsnowballQuality);
        System.out.printf("%d : %d = %.0f (%d)",NewsnowballSnow,NewsnowballTime,result,NewsnowballQuality);
    }
}
