import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class AnonymousThreat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        String command = input[0];
        while (!command.equals("3:1")){

            if (command.equals("merge")){
                mergeEl(texts,input);
            }

            input = scanner.nextLine().split(" ");
            command = input[0];
        }
        System.out.println();
    }

    private static void mergeEl(List<String> texts, String[] input) {

        List<String> saver = new ArrayList<>();
        for (int i = 0; i < texts.size(); i++) {
            saver.add(texts.get(i));
        }

        int[] startIndex = new int[1];
        int[] endIndex = new int[1];
        startIndex[0] = Integer.parseInt(input[1]);
        endIndex[0] = Integer.parseInt(input[2]);
        checksStartAndEndIndexs(startIndex,endIndex,texts);

        int start = startIndex[0];
        int end = endIndex[0];
        String saveEls = "";

        for (int i = start; i <= end; i++) {

            saveEls += texts.get(start);
            texts.remove(start);
        }
        texts.add(start,saveEls);
    }

    private static void checksStartAndEndIndexs(int[] startIndex, int[] endIndex,List<String> texts) {

        if (startIndex[0] < 0){
            startIndex[0] = 0;
        }
        if (endIndex[0] > texts.size() - 1){
            endIndex[0] = texts.size() - 1;
        }
    }
}
