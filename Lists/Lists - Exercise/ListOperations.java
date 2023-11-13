import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")){

            if (command[0].equals("Add")){
                addEl(numbers,command);
            }
            else if (command[0].equals("Remove")){
                removeEl(numbers,command);
            }
            else if (command[1].equals("left")){
                shiftElementsInLeft(numbers,command);
            }
            else if (command[1].equals("right")){
                shiftElementsInRight(numbers,command);
            }
            else if (command[0].equals("Insert")){
                insertElements(numbers,command);
            }
            command = scanner.nextLine().split("\\s+");
        }
        numbers.forEach(el-> System.out.print(el + " "));
    }

    private static void addEl(List<Integer> numbers,String[] command) {
        numbers.add(Integer.parseInt(command[1]));
    }

    private static void removeEl(List<Integer> numbers, String[] command) {
        int index = Integer.parseInt(command[1]);
        if (index >= numbers.size()){
            System.out.println("Invalid index");
            return;
        }
        if (index < 0){
            System.out.println("Invalid index");
            return;
        }
        numbers.remove(Integer.parseInt(command[1]));
    }

    private static void shiftElementsInLeft(List<Integer> numbers, String[] command) {

        int index = Integer.parseInt(command[2]);
        if (index < 0){
            System.out.println("Invalid index");
            return;
        }
        for (int i = 0; i < index; i++) {
            numbers.add(numbers.get(0));
            numbers.remove(0);
        }
    }

    private static void shiftElementsInRight(List<Integer> numbers, String[] command) {

        int index = Integer.parseInt(command[2]);
        if (index < 0){
            System.out.println("Invalid index");
            return;
        }
        for (int i = 0; i < index; i++) {
            int el = numbers.get(numbers.size() - 1);
            numbers.add(0,el);
            numbers.remove(numbers.size() - 1);
        }
    }

    private static void insertElements(List<Integer> numbers, String[] command) {

        int index = Integer.parseInt(command[2]);
        if (index < 0){
            System.out.println("Invalid index");
            return;
        }
        if (index >= numbers.size()){
            System.out.println("Invalid index");
            return;
        }
        numbers.add(index,Integer.parseInt(command[1]));
    }
}
