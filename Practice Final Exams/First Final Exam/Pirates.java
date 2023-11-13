import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<TargetP> targetsList = new ArrayList<>();
        while (!line.equals("Sail")) {
            String[] data = line.split("\\|\\|");
            String town = data[0];
            int population = Integer.parseInt(data[1]);
            int goldCount = Integer.parseInt(data[2]);
            boolean isTrue = false;
            for (int i = 0; i < targetsList.size(); i++) {
                if (targetsList.get(i).getTown().equals(town)) {

                    int currentPopulation = targetsList.get(i).getPopulation();
                    int currentGold = targetsList.get(i).getGoldCount();

                    targetsList.get(i).setPopulation(currentPopulation + population);
                    targetsList.get(i).setGoldCount(currentGold + goldCount);
                    isTrue = true;
                    break;
                }
            }
            if (isTrue) {
                line = scanner.nextLine();
                continue;
            }
            TargetP target = new TargetP(town, population, goldCount);
            targetsList.add(target);
            line = scanner.nextLine();
        }
        System.out.println();

        line = scanner.nextLine();
        while (!line.equals("End")) {

            String[] data = line.split("=>");
            String command = data[0];

            switch (command) {
                case "Plunder":

                    String town = data[1];
                    int population = Integer.parseInt(data[2]);
                    int goldCount = Integer.parseInt(data[3]);
                    for (int i = 0; i < targetsList.size(); i++) {
                        if (targetsList.get(i).getTown().equals(town)) {

                            int currentGold = targetsList.get(i).getGoldCount();
                            int currentPopulation = targetsList.get(i).getPopulation();

                            targetsList.get(i).setGoldCount(currentGold - goldCount);
                            targetsList.get(i).setPopulation(currentPopulation - population);
                            System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",
                                    town, goldCount, population);
                            if ((targetsList.get(i).getPopulation() == 0
                                    || targetsList.get(i).getGoldCount() == 0) || ((targetsList.get(i).getPopulation() == 0
                                    && targetsList.get(i).getGoldCount() == 0))) {
                                System.out.printf("%s has been wiped off the map!\n", targetsList.get(i).getTown());
                                targetsList.remove(i);
                                break;
                            }
                        }
                    }
                    break;

                case "Prosper":
                    int gold = Integer.parseInt(data[2]);
                    String city = data[1];
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else if (gold > 0) {

                        for (int i = 0; i < targetsList.size(); i++) {
                            if (targetsList.get(i).getTown().equals(city)) {
                                int currentGold = targetsList.get(i).getGoldCount();
                                targetsList.get(i).setGoldCount(currentGold + gold);
                                System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n",
                                        gold, city, targetsList.get(i).getGoldCount());
                                break;
                            }
                        }

                    }
                    break;
            }
            line = scanner.nextLine();
        }
        if (!targetsList.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %s wealthy settlements to go to:\n", targetsList.size());
            targetsList.forEach(e -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n"
                    , e.getTown(), e.getPopulation(), e.getGoldCount()));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }

    static class TargetP {
        String town;
        int population;
        int goldCount;

        public TargetP(String town, int population, int goldCount) {
            this.town = town;
            this.population = population;
            this.goldCount = goldCount;
        }

        public String getTown() {
            return town;
        }

        public int getPopulation() {
            return population;
        }

        public int getGoldCount() {
            return goldCount;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public void setGoldCount(int goldCount) {
            this.goldCount = goldCount;
        }
    }
}
