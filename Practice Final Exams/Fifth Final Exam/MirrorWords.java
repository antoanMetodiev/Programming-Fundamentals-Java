import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([@|#])[A-Za-z]{3,}\\1\\1[A-Za-z]{3,}\\1");
        Matcher matcher = pattern.matcher(input);


        int counter = 0;
        List<String> wordList = new ArrayList<>();
        boolean isTrue = false;
        while (matcher.find()) {

            counter++;
            String[] words = matcher.group().split("##|@@");
            String firstWord = words[0];
            StringBuilder secondWord = new StringBuilder(words[1]).reverse();

            if (firstWord.equals(secondWord.toString())) {
                wordList.add(firstWord);
                wordList.add(secondWord.reverse().toString());
                isTrue = true;
            }
        }
        if (counter > 0) {

            System.out.printf("%d word pairs found!\n", counter);
        }else{
            System.out.println("No word pairs found!");
        }

        String resultText = "";
        if (isTrue) {

            System.out.println("The mirror words are:");
            while (!wordList.isEmpty()) {

                resultText += String.format("%s <=> %s, ", wordList.get(0), wordList.get(1));
                wordList.remove(0);
                wordList.remove(0);
            }
            resultText = resultText.replaceAll("[#@]", "");

            int lastIndex = resultText.lastIndexOf(",");
            resultText = resultText.substring(0, lastIndex);
            System.out.println(resultText);
        } else  {

            System.out.println("No mirror words!");
        }

    }
}
