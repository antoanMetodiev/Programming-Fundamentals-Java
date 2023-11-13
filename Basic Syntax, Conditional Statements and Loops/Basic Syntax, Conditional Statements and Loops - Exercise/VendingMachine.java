import java.util.Scanner;
public class VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double allsum = 0;
        boolean flag1 = false;

            String command = scanner.nextLine();
            while(!command.equals("Start")){

                double monets = Double.parseDouble(command);
                if (monets == 2){
                    allsum += monets;
                }
                else if (monets == 1){
                    allsum += monets;
                }
                else if (monets == 0.50){
                    allsum += monets;
                }
                else if (monets == 0.20){
                    allsum += monets;
                }
                else if (monets == 0.10){
                    allsum += monets;
                }
                else {
                    System.out.printf("Cannot accept %.2f\n",monets);
                }
                command = scanner.nextLine();
            }

            while (command.equals("Start")){

                String products = scanner.nextLine();
                while (!products.equals("End")){

                    String product = "";
                    if (products.equals("Nuts")){

                        product = "Nuts";
                        if (allsum >= 2){
                            allsum -= 2;
                            System.out.printf("Purchased %s\n",product);
                        }
                        else{
                            System.out.println("Sorry, not enough money");
                        }
                    }
                    else if (products.equals("Water")){

                        product = "Water";
                        if (allsum >= 0.70){

                            allsum -= 0.70;
                            System.out.printf("Purchased %s\n",product);
                        }
                        else{
                            System.out.println("Sorry, not enough money");
                        }
                    }
                    else if (products.equals("Crisps")){

                        product = "Crisps";
                        if (allsum >= 1.50){
                            allsum -= 1.50;
                            System.out.printf("Purchased %s\n",product);
                        }
                        else{
                            System.out.println("Sorry, not enough money");
                        }

                    } else if (products.equals("Soda")){

                        product = "Soda";
                        if (allsum >= 0.80){
                            allsum -= 0.80;
                            System.out.printf("Purchased %s\n",product);
                        }
                        else{
                            System.out.println("Sorry, not enough money");
                        }
                    }
                    else if (products.equals("Coke")){

                        product = "Coke";
                        if (allsum >= 1){
                            allsum -= 1;
                            System.out.printf("Purchased %s\n",product);
                        }
                        else{
                            System.out.println("Sorry, not enough money");
                        }
                    }
                    else{
                        System.out.println("Invalid product");
                    }
                    products = scanner.nextLine();
                }
                if (products.equals("End")){
                    System.out.printf("Change: %.2f",allsum);
                    return;
                }
            }
    }
}
