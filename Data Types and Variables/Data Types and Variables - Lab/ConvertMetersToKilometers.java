import java.util.Scanner;
public class ConvertMetersToKilometers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());
        double inKm = (double)meters / 1000;
        System.out.printf("%.2f",inKm);
    }
}
