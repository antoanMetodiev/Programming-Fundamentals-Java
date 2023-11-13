import java.util.*;
public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        int firstIndex = input.lastIndexOf("\\");
        String specialWords = input.substring(firstIndex + 1);
        int commaIndex = specialWords.lastIndexOf(".");

        String firstPart = specialWords.substring(0, commaIndex);
        String secondPart = specialWords.substring(commaIndex + 1);
        System.out.println("File name: " + firstPart);
        System.out.println("File extension: " + secondPart);
    }
}
