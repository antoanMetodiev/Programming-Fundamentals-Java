import java.util.Scanner;
public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());
        int explosions = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != 62 && explosions > 0){
                text.deleteCharAt(i);
                i--;
                explosions--;
            }else if (text.charAt(i) == 62){
                explosions += Integer.parseInt("" + text.charAt(i + 1));
            }
        }
        System.out.println(text);
    }
}
