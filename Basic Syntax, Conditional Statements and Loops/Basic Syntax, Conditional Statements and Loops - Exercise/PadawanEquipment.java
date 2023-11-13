import java.util.Scanner;
public class PadawanEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double swordPrice = Double.parseDouble(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double moreSword = 0;

        int freeBealts = studentsCount / 6;

            moreSword = Math.ceil(studentsCount * 0.10);
            moreSword += studentsCount;

            double totalMoney = moreSword * swordPrice;
            totalMoney += studentsCount * outfitPrice;
            totalMoney += (studentsCount - freeBealts) * beltPrice;

            if (totalMoney <= budget){
                System.out.printf("The money is enough - it would cost %.2flv.",totalMoney);
            }
            else{
                totalMoney -= budget;
                System.out.printf("George Lucas will need %.2flv more.",totalMoney);
            }
    }
}
