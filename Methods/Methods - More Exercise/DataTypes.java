import java.util.Scanner;
public class DataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")){
            calculateIntNum(scanner);
        }else if (type.equals("real")){
            calculateDoubleNum(scanner);
        }else if(type.equals("string")){
            printString(scanner);
        }
    }
    private static void calculateIntNum(Scanner scanner) {
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.println(firstNum * 2);
    }
    private static void calculateDoubleNum(Scanner scanner){
        double firstNum = Double.parseDouble(scanner.nextLine());
        double result = firstNum * 1.5;
        System.out.printf("%.2f",result);
    }
    private static void printString(Scanner scanner){
        String text = scanner.nextLine();
        System.out.printf("$%s$",text);
    }
}
