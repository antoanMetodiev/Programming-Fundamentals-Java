import java.util.Scanner;
public class CommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text1 = scanner.nextLine().split(" ");
        String[] text2 = scanner.nextLine().split(" ");

        for (int i = 0; i < text2.length; i++) {
            for (int j = 0; j < text1.length; j++) {

                if (text2[i].equals(text1[j])){
                    System.out.print(text2[i] + " ");
                }
            }
        }
    }
}
