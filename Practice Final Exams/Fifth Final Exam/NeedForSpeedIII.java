import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carsList = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String[] carData = scanner.nextLine().split("\\|");
            String carName = carData[0];
            int mileage = Integer.parseInt(carData[1]);  // Пробег
            int fuel = Integer.parseInt(carData[2]);    // Гориво
            Car car = new Car(mileage, fuel);
            carsList.put(carName, car);

        }


        String line = scanner.nextLine();
        while (!line.equals("Stop")) {

            String[] data = line.split("\\s+:\\s+");
            String command = data[0];
            String carName = data[1];

            switch (command) {
                case "Drive":

                    int mileage = Integer.parseInt(data[2]);  // + Преминат пробег
                    int fuelNeeded = Integer.parseInt(data[3]); // Нужно гориво

                    int currentFuel = carsList.get(carName).getFuel();
                    if (currentFuel >= fuelNeeded) {

                        int currentMileage = carsList.get(carName).getMileage();
                        carsList.get(carName).setMileage(currentMileage + mileage);

                        carsList.get(carName).setFuel(currentFuel - fuelNeeded);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n"
                                , carName, mileage, fuelNeeded);

                        if (carsList.get(carName).getMileage() >= 100000) {
                            System.out.printf("Time to sell the %s!\n", carName);
                            carsList.remove(carName);
                        }

                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    break;
                case "Refuel":

                    int refuel = Integer.parseInt(data[2]);  // Гориво за презареждане

                    int fuelCurrent = carsList.get(carName).getFuel();
                    int newRefuel = fuelCurrent + refuel;

                    int result = 0;
                    if (newRefuel >= 75) {
                        result = newRefuel - 75;
                        newRefuel -= result;
                        System.out.printf("%s refueled with %d liters\n", carName, Math.abs(fuelCurrent - newRefuel));
                        line = scanner.nextLine();
                        carsList.get(carName).setFuel(75);
                        continue;
                    }
                    carsList.get(carName).setFuel(newRefuel);
                    System.out.printf("%s refueled with %d liters\n", carName, refuel);

                    break;
                case "Revert":

                    int decreasingMileage = Integer.parseInt(data[2]); // Намаляаме км-те
                    int currMil = carsList.get(carName).getMileage();
                    carsList.get(carName).setMileage(currMil - decreasingMileage);
                    System.out.printf("%s mileage decreased by %d kilometers\n", carName, decreasingMileage);
                    if (carsList.get(carName).getMileage() < 10000){
                        carsList.get(carName).setMileage(10000);
                    }

                    break;

            }

            line = scanner.nextLine();
        }
        carsList.forEach((key, value) -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n"
          , key, value.getMileage(), value.getFuel()));

    }

    static class Car {
        int mileage;
        int fuel;

        public Car(int mileage, int fuel) {
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }

}
