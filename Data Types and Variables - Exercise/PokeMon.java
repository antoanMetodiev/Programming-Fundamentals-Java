import java.util.Scanner;
public class PokeMon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        short Y = Short.parseShort(scanner.nextLine());

        int counter = 0;
        short imYou = 0;
        while (!(N < M)){

            if (counter == 0){
                imYou = (short) N;
            }
            N -= M;
            counter++;
            if (N < M){
                break;
            }
            if (N == (imYou / 2)){

                if (N >= Y){
                    N = N / Y;
                }
            }
        }
        System.out.println(N);
        System.out.println(counter);
    }
}



