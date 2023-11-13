public class CenterPoint {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        printClosestPoint(x1, y1, x2, y2);
    }

    public static void printClosestPoint(double x1, double y1, double x2, double y2) {
        double distance1 = Math.sqrt(x1 * x1 + y1 * y1);
        double distance2 = Math.sqrt(x2 * x2 + y2 * y2);

        if (distance1 <= distance2) {
            System.out.printf("(%.0f, %.0f)%n", x1, y1);
        } else {
            System.out.printf("(%.0f, %.0f)%n", x2, y2);
        }
    }
}
