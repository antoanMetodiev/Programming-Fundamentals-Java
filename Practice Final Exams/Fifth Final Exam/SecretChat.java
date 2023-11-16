import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        String line = scanner.nextLine();
        while (!line.equals("Reveal")) {

            String[] data = line.split(":\\|:");
            String command = data[0];

            switch (command) {
                case "InsertSpace":

                    int index = Integer.parseInt(data[1]);
                    input.insert(index, " ");
                    System.out.println(input);
                    break;
                case "Reverse":
                    String substring = data[1];
                    String temp = "";
                    if (input.toString().contains(substring)) {
                        for (int i = 0; i < substring.length(); i++) {
                            if (substring.charAt(i) == '?') {
                                temp += "\\" + substring.charAt(i);
                                continue;
                            }
                            temp += substring.charAt(i);
                        }
                        substring = temp;

                        input = new StringBuilder(input.toString().replaceFirst(substring, ""));
                        StringBuilder text = new StringBuilder(substring).reverse();
                        input.append(text.toString().replace("\\", ""));
                        System.out.println(input);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":

                    String text = data[1];
                    String replacement = data[2];
                    String temp1 = input.toString().replace(text, replacement);
                    input.setLength(0);
                    input.append(temp1);
                    System.out.println(input);
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + input);
    }
}
