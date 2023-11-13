import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Person> personList = new ArrayList<>();
        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            Person person = new Person(data[0], data[1], Integer.parseInt(data[2]));
            personList.add(person);
            line = scanner.nextLine();
        }
        personList
                .stream()
                .sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()))
                .forEach(e -> System.out.println(e.toString()));
    }

    public static class Person {
        String name;
        String numberID;
        int age;

        public int getAge() {
            return age;
        }

        public Person(String name, String numberID, int age) {
            this.name = name;
            this.numberID = numberID;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.numberID, this.getAge());
        }
    }
}
