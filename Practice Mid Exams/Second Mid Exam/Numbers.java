import java.util.*;
import java.util.stream.Collectors;
public class Numbers{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        double sum = 0;
        for (int i = 0; i < sequence.size(); i++) {
            sum += sequence.get(i);
        }
        double averageNum = sum / sequence.size();



        List<Integer> biggerNums = new ArrayList<>();
        boolean isTrue = false;
        for (int i = 0; i < sequence.size(); i++) {

            if (sequence.get(i) > averageNum){
                biggerNums.add(sequence.get(i));
                isTrue = true;
            }


        }

        if (!isTrue){
            System.out.println("No");
            return;
        }

        Collections.sort(biggerNums);
        Collections.reverse(biggerNums);

        int counter = 0;
        for (int i = 0; i < biggerNums.size(); i++) {

            System.out.printf("%d ",biggerNums.get(i));
            counter++;

            if (counter == 5){
                return;
            }
        }

    }
}