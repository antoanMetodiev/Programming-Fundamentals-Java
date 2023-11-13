import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];

        int[] initialPositions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int position : initialPositions) {
            if (position >= 0 && position < fieldSize) {
                field[position] = 1;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            int ladybugIndex = Integer.parseInt(commandParts[0]);
            String direction = commandParts[1];
            int flyLength = Integer.parseInt(commandParts[2]);

            if (ladybugIndex >= 0 && ladybugIndex < fieldSize && field[ladybugIndex] == 1) {
                field[ladybugIndex] = 0;

                while (true) {
                    if (direction.equals("right")) {
                        ladybugIndex += flyLength;
                    } else {
                        ladybugIndex -= flyLength;
                    }

                    if (ladybugIndex < 0 || ladybugIndex >= fieldSize) {
                        break;
                    }

                    if (field[ladybugIndex] == 0) {
                        field[ladybugIndex] = 1;
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int cell : field) {
            System.out.print(cell + " ");
        }
    }
}
