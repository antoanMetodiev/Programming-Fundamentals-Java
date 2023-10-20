import java.util.Scanner;
public class MiddleCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("");
        if (text.length % 2 != 0){
            findMiddleSymbol(text);
        }else{
            findTwoMiddleSymbols(text);
        }
    }

    private static void findMiddleSymbol(String[] text){
        System.out.print(text[text.length / 2]);
    }

    private static void findTwoMiddleSymbols(String[] text){
        System.out.print(text[text.length / 2 - 1]);
        System.out.print(text[text.length / 2]);

    }
}
