import java.util.Scanner;
public class RepeatString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        String result = repeatString(text,repeatCount);
        System.out.println(result);
    }
    
    private static String repeatString(String text, int repeatCount){
        String result = "";
        for (int i = 1; i <= repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
