import java.util.Scanner;

public class P08CirclePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
         double sCircle = Math.PI * (r * r);
         double pCircle = 2 * Math.PI * r;

        System.out.printf("%.2f%n", sCircle);
        System.out.printf("%.2f", pCircle);
    }
}
