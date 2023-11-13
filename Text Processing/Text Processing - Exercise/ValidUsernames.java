import java.util.*;
public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(", ");
        for (int i = 0; i < words.length; i++){
            int size = words[i].length();
            int counter = 0;
            if (words[i].length() >= 3 && words[i].length() <= 16){
                for (int j = 0; j < words[i].length(); j++) {
                    char symbol = words[i].charAt(j);
                    if (((Character.isLetter(symbol))
                            || (Character.isDigit(symbol)) || (symbol == 45) || (symbol == 95))){
                        counter++;
                    } else{
                        break;
                    }
                }
                if (counter == size){
                    System.out.println(words[i]);
                }
            }
        }
    }
}
