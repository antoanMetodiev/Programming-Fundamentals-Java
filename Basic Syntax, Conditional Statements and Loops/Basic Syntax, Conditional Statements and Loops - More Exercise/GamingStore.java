import java.util.Scanner;
public class GamingStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double allSum = 0;
        while (!command.equals("Game Time")){

            double price = 0;
            if (command.equals("OutFall 4")){

                if (budget < 39.99){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                else{
                    System.out.println("Bought OutFall 4");
                    price = 39.99;
                }
            }
            else if (command.equals("CS: OG")){
                if (budget < 15.99){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                else{
                    System.out.println("Bought CS: OG");
                    price = 15.99;
                }
            }
            else if (command.equals("Zplinter Zell")){

                if (budget < 19.99){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                else{
                    System.out.println("Bought Zplinter Zell");
                    price = 19.99;
                }
            }
            else if (command.equals("Honored 2")){

                if (budget < 59.99){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                else{
                    System.out.println("Bought Honored 2");
                    price = 59.99;
                }
            }
            else if (command.equals("RoverWatch")){

                if (budget < 29.99){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                else{
                    System.out.println("Bought RoverWatch");
                    price = 29.99;
                }
            }
            else if (command.equals("RoverWatch Origins Edition")){
                if (budget < 39.99){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }
                else{
                    System.out.println("Bought RoverWatch Origins Edition");
                    price = 39.99;
                }
            }
            else{
                System.out.println("Not Found");
                command = scanner.nextLine();
                continue;
            }
            budget -= price;
            allSum += price;
            if (budget <= 0){
                System.out.println("Out of money!");
                return;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",allSum,budget);
    }
}
