import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> clamps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           clamps.add(scanner.nextLine());
        }
        checkClamps(clamps);
    }

    private static void checkClamps(List<String> clamps) {

        List<String> clampsSaver = new ArrayList<>();
        for (int i = 0; i < clamps.size(); i++) {

            if (clamps.get(i).equals("(") || clamps.get(i).equals(")")) {
                clampsSaver.add(clamps.get(i));
            }
        }
        CheckAndPrintClampsSaver(clampsSaver);
    }

    private static void CheckAndPrintClampsSaver(List<String> clampsSaver){

        for (int i = 0; i < clampsSaver.size(); i++) {

            char currentSymbol = clampsSaver.get(i).charAt(0);
            if ((i % 2 == 0 && currentSymbol == 41)){
                System.out.println("UNBALANCED");
                return;
            }
            else if ((i % 2 != 0 && currentSymbol == 40)){
                System.out.println("UNBALANCED");
                return;
            }
        }
        if (clampsSaver.size() % 2 != 0){
            System.out.println("UNBALANCED");
            return;
        }
        System.out.println("BALANCED");
    }
}
