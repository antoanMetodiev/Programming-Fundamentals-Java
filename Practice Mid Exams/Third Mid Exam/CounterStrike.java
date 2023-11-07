import java.util.Scanner;
public class CounterStrike{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginEnergy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int counter = 0;
        while (!command.equals("End of battle")){

            int lenght = Integer.parseInt(command);
            if ((beginEnergy - lenght) >= 0){
                beginEnergy -= lenght;
                counter++;
            } else if ((beginEnergy - lenght) < 0){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",counter,beginEnergy);
                return;
            }
            if (counter % 3 == 0){
                beginEnergy += counter;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",counter,beginEnergy);
    }
}

