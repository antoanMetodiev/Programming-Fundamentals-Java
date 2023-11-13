import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            Person person = new Person(data[0], Integer.parseInt(data[1]));
            personList.add(person);
        }
        personList.stream()
                .filter(person -> person.getAge() > 30)
                .forEach(person -> System.out.printf("%s - %d\n", person.getName(), person.getAge()));
    }

    public static class Person {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
