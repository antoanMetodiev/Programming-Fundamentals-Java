import java.util.*;
public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Plant> collector = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("<->");
            String plant = data[0];
            int rarity = Integer.parseInt(data[1]);

            Plant plantData = new Plant(rarity, new ArrayList<>());
            collector.put(plant, plantData);
        }

        String line = scanner.nextLine();
        while (!line.equals("Exhibition")) {

            String[] data = line.split(": | \\- ");
            String command = data[0];
            String plantName = data[1];  // Име на ръстението
            if (!collector.containsKey(plantName)) {
                System.out.println("error");
                line = scanner.nextLine();
                continue;
            }

            switch (command) {
                case "Rate":
                    int newRating = Integer.parseInt(data[2]);
                    collector.get(plantName).addRatings(newRating);
                    break;
                case "Update":
                    int newRarity = Integer.parseInt(data[2]);
                    collector.get(plantName).setRarity(newRarity);
                    break;
                case "Reset":
                    collector.get(plantName).removeAllRatings();
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        collector.forEach((key, value) -> {
            double averageRating = calculateAverageRating(value.getRatings());
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", key, value.getRarity(), averageRating);
        });
    }

    private static double calculateAverageRating(List<Integer> ratings) {
        double averageRating = 0;
        boolean isEmpty = true;
        for (Integer rating : ratings) {
            averageRating += rating;
            isEmpty = false;
        }
        if (isEmpty) {
            return 0;
        }
        return averageRating / ratings.size();
    }

    static class Plant {
        int rarity;
        List<Integer> ratings;

        public Plant(int rarity, List<Integer> ratings) {
            this.rarity = rarity;
            this.ratings = ratings;
        }

        public void addRatings(int rarity) {
            this.ratings.add(rarity);
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void removeAllRatings() {
            this.ratings.clear();
        }

        public int getRarity() {
            return rarity;
        }

        public List<Integer> getRatings() {
            return ratings;
        }
    }
}
