import java.util.Scanner;
public class GuineaPig{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;
        double weight = Double.parseDouble(scanner.nextLine()) * 1000;
        for (int i = 1; i <= 30; i++) {

            food -= 300;
            if (food <= 0) {
                break;
            }
            if (i % 2 == 0) {
                hay -= food * 0.05;
                if (hay <= 0) {
                    break;
                }
            }
            if (i % 3 == 0) {
                cover -= weight / 3;
                if (cover <= 0) {
                    break;
                }
            }
        }

        cover /= 1000;
        hay /= 1000;
        food /= 1000;
        if ((hay > 0 && cover > 0) && food > 0){
            System.out.printf("Everything is fine! Puppy is happy!" +
                    " Food: %.2f, Hay: %.2f, Cover: %.2f.", food, hay, cover);
        }else{
            System.out.println("Merry must go to the pet store!");
        }
    }
}
