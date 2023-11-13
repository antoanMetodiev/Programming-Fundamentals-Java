import java.util.Scanner;
public class BonusScoringSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int allLectures = Integer.parseInt(scanner.nextLine());
        int moreBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxLectures = 0;
        for (int i = 1; i <= studentsCount; i++) {
            int visits = Integer.parseInt(scanner.nextLine());
            double totalBonus = ((double) visits / allLectures ) * (5 + moreBonus);
            if (totalBonus > maxBonus){
                maxBonus = totalBonus;
                maxLectures = visits;
            }
        }
        maxBonus = Math.ceil(maxBonus);
        System.out.printf("Max Bonus: %.0f.\n", maxBonus);
        System.out.printf("The student has attended %d lectures.",maxLectures);
    }
}
