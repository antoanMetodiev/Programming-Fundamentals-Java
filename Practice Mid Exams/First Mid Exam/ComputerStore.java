import java.util.Scanner;
public class ComputerStore{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        double taxes = 0;
        double allPrice = 0;
        while ((!command.equals("regular")) && (!command.equals("special"))){

            double price = Double.parseDouble(command);
            if (price <= 0){
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }
            allPrice += price;
            taxes += price * 0.20;
            command = scanner.nextLine();
        }
        if (allPrice <= 0){
            System.out.println("Invalid order!");
            return;
        }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$\n", allPrice);

        allPrice += taxes;
        if (command.equals("special")){
            allPrice -= allPrice * 0.10;
        }
        System.out.printf("Taxes: %.2f$\n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", allPrice);
    }
}
