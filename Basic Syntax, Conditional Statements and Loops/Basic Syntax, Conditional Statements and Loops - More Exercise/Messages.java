import java.util.Scanner;
public class Messages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String text = "";
        for (int i = 1; i <= n; i++){

            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers == 2){
                text += "a";
            }
            else if (numbers == 22){
                text += "b";
            }
            else if (numbers == 222){
                text += "c";
            }

            if (numbers == 3){
                text += "d";
            }
            else if (numbers == 33){
                text += "e";
            }
            else if (numbers == 333){
                text += "f";
            }

            if (numbers == 4){
                text += "g";
            }
            else if (numbers == 44){
                text += "h";
            }
            else if (numbers == 444){
                text += "i";
            }

            if (numbers == 5){
                text += "j";
            }
            else if (numbers == 55){
                text += "k";
            }
            else if (numbers == 555){
                text += "l";
            }

            if (numbers == 6){
                text += "m";
            }
            else if (numbers == 66){
                text += "n";
            }
            else if (numbers == 666){
                text += "o";
            }

            if (numbers == 7){
                text += "p";
            }
            else if (numbers == 77){
                text += "q";
            }
            else if (numbers == 777){
                text += "r";
            }
            else if (numbers == 7777){
                text += "s";
            }

            if (numbers == 8){
                text += "t";
            }
            else if (numbers == 88){
                text += "u";
            }
            else if (numbers == 888){
                text += "v";
            }

            if (numbers == 9){
                text += "w";
            }
            else if (numbers == 99){
                text += "x";
            }
            else if (numbers == 999){
                text += "y";
            }
            else if (numbers == 9999){
                text += "z";
            }

            if (numbers == 0){

                text += " ";
            }
        }
        System.out.println(text);
    }
}
