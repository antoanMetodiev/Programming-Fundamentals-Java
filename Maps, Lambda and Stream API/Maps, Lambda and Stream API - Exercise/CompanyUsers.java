import java.util.*;
public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> register = new LinkedHashMap<>();
        while (!input.equals("End")){

             String[] data = input.split("\\s+->\\s+");
             String company = data[0];
             String code = data[1];

             register.putIfAbsent(company, new ArrayList<>());
             if (!register.get(company).contains(code)){
                 register.get(company).add(code);
             }
             input = scanner.nextLine();
        }
        register.forEach((key,value) -> {

            System.out.printf("%s\n", key);
            value.forEach(v -> System.out.printf("-- %s\n", v));
        });
    }
}
