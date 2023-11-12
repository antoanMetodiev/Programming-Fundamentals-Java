import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());

        String line = scanner.nextLine();
        while (!line.equals("Travel")) {
            String[] data = line.split(" ");
            String command = data[0].split(":")[0];

            String[] objects = line.substring(4).split(":\\s*");
            switch (command) {
                case "Add":
                    int index = Integer.parseInt(objects[1]);
                    if (index >= 0 && index < stops.length()) {
                        stops.insert(index, objects[2]);
                    }
                    System.out.println(stops);
                    break;

                case "Remove":
                    int startIndex = Integer.parseInt(objects[1]);
                    int endIndex = Integer.parseInt(objects[2]);
                    boolean isTrue = checkIndexes(startIndex, endIndex, stops);
                    if (isTrue) {
                        stops.replace(startIndex, endIndex + 1, "");
                    }
                    System.out.println(stops);
                    break;

                case "Switch":
                    String oldObj = objects[1];
                    if (stops.toString().contains(oldObj)) {
                        String newObj = objects[2];
                        stops = new StringBuilder(stops.toString().replaceAll(oldObj, newObj));
                    }
                    System.out.println(stops);
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);

    }

    private static boolean checkIndexes(int startIndex, int endIndex, StringBuilder stops) {
        if (startIndex < 0) {
            return false;
        }
        if (endIndex < 0) {
            return false;
        }
        if (startIndex > endIndex) {
            return false;
        }
        if (startIndex >= stops.length()) {
            return false;
        }
        if (endIndex >= stops.length()) {
            return false;
        }
        return true;
    }
}
