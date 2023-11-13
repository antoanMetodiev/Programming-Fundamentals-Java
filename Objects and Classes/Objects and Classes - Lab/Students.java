import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> collector = new ArrayList<>();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];

            int age = Integer.parseInt(data[2]);
            String town = data[3];

            Student student = new Student(firstName, lastName, age, town);
            collector.add(student);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : collector) {
            if (student.getTown().equals(city)) {
                System.out.printf("%s %s is %d years old\n",
                        student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }
}
