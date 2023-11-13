import java.util.*;
public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> collector = new LinkedHashMap<>();
        for (int i = 0; i < times; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!collector.containsKey(name)){
                collector.put(name, new ArrayList<>());
                collector.get(name).add(grade);
            } else{
                collector.get(name).add(grade);
            }
        }
        collector.forEach((key, value) -> {
            double averageGrade = value.stream()
                    .mapToDouble(e-> e)
                    .average()
                    .orElse(0.0);
            if (averageGrade >= 4.50){
                System.out.printf("%s -> %.2f\n", key, averageGrade);
            }
        });
    }
}
