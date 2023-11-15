import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String line = scanner.nextLine();
        while (!line.equals("Done")) {

            String[] data = line.split(" ");
            String command = data[0];

            switch (command) {
                case "TakeOdd":

                    String newPassword = "";
                    for (int i = 1; i < password.length(); i += 2) {
                        newPassword += String.valueOf(password.charAt(i));
                    }
                    password.setLength(0);
                    password.append(newPassword);
                    System.out.println(password);
                    break;
                case "Cut":

                    int index = Integer.parseInt(data[1]);
                    int lenght = Integer.parseInt(data[2]);
                    String removedText = password.substring(index, index + lenght);
                    password = new StringBuilder(password.toString().replaceFirst(removedText, ""));
                    System.out.println(password);
                    break;

                case "Substitute":

                    String substring = data[1];
                    String replacement = data[2];
                    if (password.toString().contains(substring)) {
                        password = new StringBuilder(password.toString().replaceAll(substring, replacement));
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            line = scanner.nextLine();
        }
        System.out.printf("Your password is: %s\n", password);
    }
}
