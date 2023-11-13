import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");
        while(!command[0].equals("end")){

            if (command[0].equals("Delete")){
                deleteAllEualsNums(numbers,command);
            }
            else if (command[0].equals("Insert")){
                insertNum(numbers,command);
            }
            command = scanner.nextLine().split(" ");
        }
        printList(numbers);
    }

    private static void deleteAllEualsNums(List<Integer> numbers,String[] command) {

        int delNum = Integer.parseInt(command[1]);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == delNum){
                numbers.remove(i);
                i--;
            }
        }
    }

    private static void insertNum(List<Integer> numbers, String[] command) {

        int index = Integer.parseInt(command[2]);
        int num = Integer.parseInt(command[1]);
        numbers.add(index, num);
    }

    private static void printList(List<Integer> numbers){
        numbers.forEach(el-> System.out.print(el + " "));
    }
}
