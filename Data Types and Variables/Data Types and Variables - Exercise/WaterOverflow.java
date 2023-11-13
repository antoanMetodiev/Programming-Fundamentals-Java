import java.util.Scanner;
public class WaterOverflow {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int allLiters = 255;
        int totalLiters = 0;
        for (int i = 1; i <= n ; i++){

            int inReservoar = Integer.parseInt(scanner.nextLine());
            if (inReservoar > allLiters){
                System.out.println("Insufficient capacity!");
                continue;
            }
            allLiters -= inReservoar;
            totalLiters += inReservoar;
        }
        System.out.println(totalLiters);
    }
}
