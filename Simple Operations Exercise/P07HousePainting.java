import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine()); // височина на къщата
        double y = Double.parseDouble(scanner.nextLine()); // дължина на странична стена
        double h = Double.parseDouble(scanner.nextLine()); // височина на триъгълна стена на покрива

        double frontSide = (x * x) - (1.2 * 2);
        double backSide = x * x;
        double sides = (2 * ((x * y) - (1.5 * 1.5)));
        double areaHouse = frontSide + backSide + sides;
        double price = areaHouse / 3.4;

        double roofRectangle = 2 * (x * y);
        double roofTriangle = 2 * (x * h / 2.0);
        double areaRoof = roofTriangle + roofRectangle;
        double priceRoof = areaRoof / 4.3;

        System.out.printf("%.2f%n", price);
        System.out.printf("%.2f%n", priceRoof);

    }
}
