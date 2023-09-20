import java.util.Scanner;
public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        for (int i = 1; i <= 4; i++){

            String password = scanner.nextLine();
            String password2 = "";
            for (int j = password.length() - 1; j >= 0; j--) {
                password2 += "" + password.charAt(j);
            }
            if (password2.equals(username)){
                System.out.printf("User %s logged in.",username);
                return;
            }
            else{

                if (i == 4){
                    System.out.printf("User %s blocked!",username);
                    return;
                }
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}