import java.util.Scanner;
public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder hiddenText = new StringBuilder(scanner.nextLine());

        String action = scanner.nextLine();
        while (!action.equals("Reveal")){

            String[] arr = action.split(":\\|:");
            String command = arr[0];
            if (command.equals("ChangeAll")){
                String oldObj = arr[1];
                String newObj = arr[2];

                hiddenText = new StringBuilder(hiddenText.toString().replaceAll(oldObj, newObj));
                System.out.println(hiddenText);
            }else if (command.equals("Reverse")){

                String temp = arr[1];
                StringBuilder obj = new StringBuilder();
                obj.append(temp);
                if (hiddenText.toString().contains(obj)){

                    String slash = "\\";
                    for (int i = 0; i < temp.length(); i++) {
                        char symbol = obj.charAt(i);
                        if (symbol == '?'){
                            obj.insert(i, "\\");
                            i++;
                        }
                    }
                    hiddenText = new StringBuilder(hiddenText.toString().replaceFirst(obj.toString(), ""));
                    obj.reverse();
                    for (int i = 0; i < obj.length(); i++) {
                        char symbol = obj.charAt(i);
                        if (symbol == '\\'){
                            obj = new StringBuilder(obj.toString().replace("\\", ""));
                        }
                    }
                    hiddenText.append(obj);
                    System.out.println(hiddenText);
                }else{
                    System.out.println("error");
                }
            }else if (command.equals("InsertSpace")){
                int index = Integer.parseInt(arr[1]);
                hiddenText.insert(index, " ");
                System.out.println(hiddenText);
            }
            action = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", hiddenText);
    }
}
