import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstCardList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondCardList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!firstCardList.isEmpty() && !secondCardList.isEmpty()) {

            int firstCard = firstCardList.remove(0);
            int secondCard = secondCardList.remove(0);
            if (firstCard > secondCard) {
                firstCardList.add(firstCard);
                firstCardList.add(secondCard);
            } else if (secondCard > firstCard) {
                secondCardList.add(secondCard);
                secondCardList.add(firstCard);
            }
        }
        
        int sum = 0;
        if (!firstCardList.isEmpty()) {
            sum = firstCardList.stream().mapToInt(e -> e).sum();
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            sum = secondCardList.stream().mapToInt(e -> e).sum();
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
