import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int vagonMaxCapacity = Integer.parseInt(scanner.nextLine());

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")){

            if (command[0].equals("Add")){
                train.add(Integer.parseInt(command[1]));
            }
            else{
                int passengers = Integer.parseInt(command[0]);
                addPassengers(train,vagonMaxCapacity,passengers);
            }
            command = scanner.nextLine().split(" ");
        }
        printVagons(train);
    }

    private static void addPassengers(List<Integer> train, int vagonMaxCapacity,int passengers){

        for (int i = 0; i < train.size(); i++) {
            if (train.get(i) + passengers <= vagonMaxCapacity){
                train.set(i, train.get(i) + passengers);
                return;
            }
        }
    }

    private static void printVagons(List<Integer> train) {
        train.forEach(el-> System.out.print(el + " "));
    }
}
