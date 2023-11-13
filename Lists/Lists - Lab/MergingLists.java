import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class MergingLists {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        findAndPrintToMinList(firstList,secondList);
    }

    private static void findAndPrintToMinList(List<Integer> firstList,List<Integer> secondList){

        int minList = Math.min(firstList.size(),secondList.size());
        for (int i = 0; i < minList; i++) {
            System.out.print(firstList.get(i) + " " + secondList.get(i)+ " ");
        }
        printBiggerList(firstList,secondList,minList);
    }

    private static void printBiggerList(List<Integer> firstList,List<Integer> secondList,int minList){

            if (firstList.size() > secondList.size()){
                for (int i = minList; i < firstList.size(); i++) {
                    System.out.print(firstList.get(i) + " ");
                }
            }
            else if (secondList.size() > firstList.size()){
                for (int i = minList; i < secondList.size(); i++) {
                    System.out.print(secondList.get(i) + " ");
                }
            }
    }
}
