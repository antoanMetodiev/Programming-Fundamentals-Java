import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Pattern patternWord = Pattern.compile("(@[#]+)\\b(([A-Z])([A-Za-z0-9]{4,})([A-Z]){1})\\b(@[#]+)");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcherWord = patternWord.matcher(input);
            boolean isFind = false;
            while (matcherWord.find()){
                isFind = true;

                ////

                Pattern patternDigits = Pattern.compile("[0-9]");
                Matcher matcherDigits = patternDigits.matcher(matcherWord.group());

                boolean isInside = false;
                String ditigs = "";
                while (matcherDigits.find()){
                    isInside = true;
                    ditigs += "" + matcherDigits.group();
                }

                if (!isInside){
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %s\n", ditigs);
                }
            }

            if (!isFind){
                System.out.println("Invalid barcode");
            }

        }
    }
}
