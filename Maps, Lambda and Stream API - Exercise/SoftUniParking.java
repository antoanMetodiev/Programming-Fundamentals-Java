import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> dataRegister = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            String name = data[1];
            if (command.equals("register")){

                String rNumber = data[2];
                if (!dataRegister.containsKey(name)){
                    dataRegister.put(name, rNumber);
                    System.out.printf("%s registered %s successfully\n", name, rNumber);
                } else{
                    System.out.printf("ERROR: already registered " +
                            "with plate number %s\n", dataRegister.get(name));
                }
            }
            else if (command.equals("unregister")){

                if (dataRegister.containsKey(name)){
                    System.out.printf("%s unregistered successfully\n", name);
                    dataRegister.remove(name);
                } else{
                    System.out.printf("ERROR: user %s not found\n", name);
                }
            }
        }
        dataRegister.forEach((key, value) -> System.out.printf("%s => %s\n", key, value));
    }
}
