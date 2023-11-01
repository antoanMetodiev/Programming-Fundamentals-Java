import java.util.*;
public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> resources = new LinkedHashMap<>();
        while (!input.equals("end")){

            String[] data = input.split("\\s+:\\s+");
            String course = data[0];
            String student = data[1];

            resources.putIfAbsent(course, new ArrayList<>());
            resources.get(course).add(student);

            input = scanner.nextLine();
        }
        resources.forEach((key, value) -> {
            System.out.printf("%s: %d\n", key, value.size());
            value.forEach(v -> System.out.printf("-- %s\n", v));
        });
    }
}
