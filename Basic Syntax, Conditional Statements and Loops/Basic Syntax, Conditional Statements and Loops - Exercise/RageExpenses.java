import java.util.Scanner;
public class RageExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short losesGames = Short.parseShort(scanner.nextLine());
        double headphonesPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double allMoney = 0;
        int counter = 0;
        for (int i = 1; i <= losesGames ; i++){

            if (i % 2 == 0 && i % 3 == 0){

                allMoney += headphonesPrice;
                allMoney += mousePrice;
                allMoney += keyboardPrice;
                counter++;
                if (counter % 2 == 0){
                    allMoney += displayPrice;
                }
            }
            else if(i % 2 == 0 && i != 0){
                allMoney += headphonesPrice;
            }
            else if(i % 3 == 0 && i != 0){
                allMoney += mousePrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.",allMoney);
    }
}
