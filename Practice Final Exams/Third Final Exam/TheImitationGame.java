import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        String actions = scanner.nextLine();
        while (!actions.equals("Decode")) {

            String[] data = actions.split("\\|");
            String command = data[0];
            switch (command) {
                case "Move":
                    int n = Integer.parseInt(data[1]);
                    if (checkIndex(input, n)) {
                        String substring = input.substring(0, n);
                        input.replace(0, n, "");
                        input.append(substring);
                        break;
                    }
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    if (index >= 0 && index <= input.length()) {
                        String value = data[2];
                        input.insert(index, value);
                        break;
                    }
                case "ChangeAll":
                    String oldObj = data[1];
                    if (input.toString().contains(oldObj)) {

                        int replaceIndex = input.indexOf(oldObj);
                        String newObj = data[2];
                        while (replaceIndex != -1) {
                            input.replace(replaceIndex, replaceIndex + oldObj.length(), newObj);
                            replaceIndex = input.indexOf(oldObj);
                        }
                    }
                    break;
            }
            actions = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", input);
    }

    private static boolean checkIndex(StringBuilder input, int index) {
        if (index >= 0 && index < input.length() - 1) {
            return true;
        }
        return false;
    }
}
