import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            studentsList.add(student);
        }
        studentsList.stream()
                .sorted((student1, student2) -> Double.compare(student2.getGrade(), student1.getGrade()))
                .forEach(e -> System.out.println(e.toString()));
    }

    static class Student {
         String firstName;
         String lastName;
          double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.lastName = secondName;
            this.grade = grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public double getGrade() {
            return this.grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }
    }
}
