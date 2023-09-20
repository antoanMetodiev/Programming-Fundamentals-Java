import java.util.Scanner;
public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();

        double price = 0;
        double discount = 0;
        if (weekDay.equals("Friday")){

            if (groupType.equals("Students")){

                price = 8.45;
                if (peopleCount >= 30){
                    discount = 0.15;
                }
            }
            else if (groupType.equals("Business")){

                price = 10.90;
                if (peopleCount >= 100){
                    peopleCount -= 10;
                }
            }
            else if (groupType.equals("Regular")){

                price = 15;
                if (peopleCount >= 10 && peopleCount <= 20){
                    discount = 0.05;
                }
            }
        }
        else if (weekDay.equals("Saturday")){

            if (groupType.equals("Students")){

                price = 9.80;
                if (peopleCount >= 30){
                    discount = 0.15;
                }
            }
            else if (groupType.equals("Business")){

                price = 15.60;
                if (peopleCount >= 100){
                    peopleCount -= 10;
                }
            }
            else if (groupType.equals("Regular")){

                price = 20;
                if (peopleCount >= 10 && peopleCount <= 20){
                    discount = 0.05;
                }
            }
        }
        else if (weekDay.equals("Sunday")){

            if (groupType.equals("Students")){

                price = 10.46;
                 if (peopleCount >= 30){
                    discount = 0.15;
                }
            }
            else if (groupType.equals("Business")){

                price = 16;
                if (peopleCount >= 100){
                    peopleCount -= 10;
                }
            }
            else if (groupType.equals("Regular")){

                price = 22.50;
                 if (peopleCount >= 10 && peopleCount <= 20){
                    discount = 0.05;
                }
            }
        }
        price = peopleCount * price;
        price -= price * discount;
        System.out.printf("Total price: %.2f",price);
    }
}


