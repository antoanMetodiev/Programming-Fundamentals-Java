import java.util.Random;
import java.util.Scanner;
public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Message message = new Message();
        message.getRandomIndex(n);
    }

    static class Message {
        String[] phrase = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena",
                "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        public void getRandomIndex(int n) {
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                int phraseIndex = random.nextInt(phrase.length);
                int eventIndex = random.nextInt(events.length);
                int authorsIndex = random.nextInt(authors.length);
                int citiesIndex = random.nextInt(cities.length);

                System.out.printf("%s %s %s – %s.\n", phrase[phraseIndex],
                        events[eventIndex], authors[authorsIndex], cities[citiesIndex]);
            }
        }
    }
}
