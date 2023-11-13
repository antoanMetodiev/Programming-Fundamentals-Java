import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighborhood = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String acitons = scanner.nextLine();
        int index = 0;
        while (!acitons.equals("Love!")){

            String[] arr = acitons.split("\\s+");
            index += Integer.parseInt(arr[1]);
            if (index >= neighborhood.size()){
                index = 0;
            }
            if (neighborhood.get(index) == 0){
                System.out.printf("Place %d already had Valentine's day.\n", index);
                acitons = scanner.nextLine();
                continue;
            }
            int setVallue = neighborhood.get(index) - 2;
            neighborhood.set(index,setVallue);
            if (neighborhood.get(index) == 0){
                System.out.printf("Place %d has Valentine's day.\n", index);
            }
            acitons = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.\n", index);

        int fails = checkKupidonFails(neighborhood);
        if (fails == 0){
            System.out.println("Mission was successful.");

        }else{
            System.out.printf("Cupid has failed %d places.", fails);
        }
    }

    private static int checkKupidonFails(List<Integer> neighborhood) {
        int counter = 0;
        for (int i = 0; i < neighborhood.size(); i++) {
            if (neighborhood.get(i) > 0){
                counter++;
            }
        }
        return counter;
    }
}