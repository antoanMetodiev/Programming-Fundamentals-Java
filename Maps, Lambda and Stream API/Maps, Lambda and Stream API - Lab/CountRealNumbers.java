import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;
public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> saver = new TreeMap<>();
        for (double number : input) {
            
            if (!saver.containsKey(number)){
                saver.put(number, 1);
            }else{
                int value = saver.get(number) + 1;
                saver.put(number,value);
            }
        }
        printSaverMap(saver);
    }

    private static void printSaverMap (Map<Double, Integer> saver){

        for (Map.Entry<Double, Integer> map : saver.entrySet()) {
            DecimalFormat df = new DecimalFormat("0.####");
            System.out.printf("%s -> %d\n", df.format(map.getKey()), map.getValue());
        }
    }
}
