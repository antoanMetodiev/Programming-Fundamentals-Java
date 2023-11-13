import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Vehicle> carsList = new ArrayList<>();
        List<Vehicle> trucksList = new ArrayList<>();
        int trucksHPower = 0;
        int carsHPower = 0;
        int carsCounter = 0;
        int trucksCounter = 0;
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String vehicleType = data[0];
            String model = data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);

            if (vehicleType.equals("truck")) {
                vehicleType = vehicleType.substring(0, 1).toUpperCase() + vehicleType.substring(1);
                Vehicle vehicle = new Vehicle(vehicleType, model, color, horsePower);
                trucksList.add(vehicle);
                trucksCounter++;
                trucksHPower += horsePower;
            } else if (vehicleType.equals("car")) {
                vehicleType = vehicleType.substring(0, 1).toUpperCase() + vehicleType.substring(1);
                Vehicle vehicle = new Vehicle(vehicleType, model, color, horsePower);
                carsList.add(vehicle);
                carsHPower += horsePower;
                carsCounter++;
            }
            input = scanner.nextLine();
        }

        String line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")) {

            String vehicleModel = line;
            boolean isInside = false;
            for (Vehicle truck : trucksList) {
                if (truck.getModel().equals(vehicleModel)) {
                    truck.printVehicle(truck);
                    isInside = true;
                }
            }
            if (isInside) {
                line = scanner.nextLine();
                continue;
            }
            for (Vehicle car : carsList) {
                if (car.getModel().equals(vehicleModel)) {
                    car.printVehicle(car);
                }
            }
            line = scanner.nextLine();
        }

        double carsHPowerResult = 0;
        if (carsHPower == 0 || carsCounter == 0) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", carsHPowerResult);
        } else {
            carsHPowerResult = (double) carsHPower / carsCounter;
            System.out.printf("Cars have average horsepower of: %.2f.\n", carsHPowerResult);
        }

        double trucksHPowerResult = 0;
        if (trucksHPower == 0 || trucksCounter == 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksHPowerResult);
        } else {
            trucksHPowerResult = (double) trucksHPower / trucksCounter;
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksHPowerResult);
        }
    }

    public static class Vehicle {
        String vehicleType;
        String model;
        String color;
        int hoursPower;

        public String getVehicleType() {
            return vehicleType;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHoursPower() {
            return hoursPower;
        }

        public Vehicle(String vehicleType, String model, String color, int hoursPower) {
            this.vehicleType = vehicleType;
            this.model = model;
            this.color = color;
            this.hoursPower = hoursPower;
        }

        public void printVehicle(Vehicle vehicle) {
            System.out.printf("Type: %s\n", vehicle.getVehicleType());
            System.out.printf("Model: %s\n", vehicle.getModel());
            System.out.printf("Color: %s\n", vehicle.getColor());
            System.out.printf("Horsepower: %d\n", vehicle.getHoursPower());
        }
    }
}
