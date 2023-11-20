import java.util.Scanner;
public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ages = Integer.parseInt(scanner.nextLine());
        String stage = "";

        if (ages >= 0 && ages <= 2){
            stage = "baby";
        } else if (ages >= 3 && ages <= 13){
            stage = "child";
        }else if (ages >= 14 && ages <= 19){
            stage = "teenager";
        }else if (ages >= 20 && ages <= 65){
            stage = "adult";
        }else if (ages >= 66){
            stage = "elder";
        }
        System.out.println(stage);
    }
}
