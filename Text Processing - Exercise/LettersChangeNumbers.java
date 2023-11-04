import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String aplhabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        double allSum = 0;

        for (int i = 0; i < words.size(); i++) {

                StringBuilder currentWord = new StringBuilder(words.get(i));
                int currentNumber = Integer.parseInt(currentWord.substring(1,currentWord.length() - 1));

                    char beginLetter = currentWord.substring(0,1).charAt(0);
                    if (beginLetter >= 65 && beginLetter <= 90){ // Проверява дали е ГОЛЯМА e БУКВА
                       aplhabet = aplhabet.toUpperCase();
                       int position = aplhabet.indexOf("" + beginLetter) + 1;
                        allSum += (double) currentNumber / position;
                    }
                    else if(beginLetter >= 97 && beginLetter <= 122){ // Проверява дали е МАЛКА e БУКВА
                        aplhabet = aplhabet.toLowerCase();
                        int position = aplhabet.indexOf("" + beginLetter) + 1;
                        allSum += currentNumber * position;
                    }

                    // b
                    char endLetter = currentWord.substring(currentWord.length() - 1).charAt(0);
                    if (endLetter >= 65 && endLetter <= 90){ // Проверява дали е ГОЛЯМА e БУКВА
                        aplhabet = aplhabet.toUpperCase();
                        int position = aplhabet.indexOf("" + endLetter) + 1;
                        allSum -= position;
                    }
                    else if (endLetter >= 97 && endLetter <= 122){  // Проверява дали e МАЛКА e БУКВА
                        aplhabet = aplhabet.toLowerCase();
                        int position = aplhabet.indexOf("" + endLetter) + 1;
                        allSum += position;
                    }
        }
        System.out.printf("%.2f", allSum);
    }
}