import java.util.Scanner;
public class Elevator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = n / capacity;
        if (capacity * courses < n){
            courses++;
            System.out.println(courses);
        }
        else if (capacity * courses >= n){
            System.out.println(courses);
        }
    }
}
