import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ShootForTheWin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        int counter = 0;
        while (!command.equals("End")){

            int index = Integer.parseInt(command);
            if ((index >= 0 && index < targets.size()) && targets.get(index) != -1){
                counter++;
                int vallue = targets.get(index);
                targets.set(index,-1);
                decreasesEls(targets,vallue);
            }
            command = scanner.nextLine();
        }
        printTargets(targets,counter);
    }

    private static void decreasesEls(List<Integer> targets, int vallue) {
        for (int i = 0; i < targets.size(); i++) {
            if (vallue < targets.get(i) && targets.get(i) != - 1) {
                int setter = targets.get(i) - vallue;
                targets.set(i, setter);
            } else if(targets.get(i) <= vallue && targets.get(i) != -1){
                int setter = targets.get(i) + vallue;
                targets.set(i,setter);
            }
        }
    }

    private static void printTargets(List<Integer> targets, int counter) {
        System.out.printf("Shot targets: %d -> ",counter);
        for (int i = 0; i < targets.size(); i++) {
            System.out.printf("%d ",targets.get(i));
        }
    }
}
