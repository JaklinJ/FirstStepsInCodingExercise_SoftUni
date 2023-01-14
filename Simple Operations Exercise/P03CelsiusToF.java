import java.util.Scanner;

public class P03CelsiusToF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c = Double.parseDouble(scanner.nextLine());
        // Multiply the °C temperature by 1.8. Add 32 to this number.

        double f = (c * 1.8) + 32;
        System.out.printf("%.2f", f);
    }
}
