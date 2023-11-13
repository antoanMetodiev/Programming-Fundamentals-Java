import java.util.Scanner;
public class BeerKegs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int botles = Integer.parseInt(scanner.nextLine());

        double maxValue = 0;
        String winnerBotle = "";
        for (int i = 1; i <= botles ; i++) {

            String botleModel = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());

            double result = Math.PI * (r * r) * h;
            if (result > maxValue){
                maxValue = result;
                winnerBotle = botleModel;
            }
        }
        System.out.println(winnerBotle);
    }
}
