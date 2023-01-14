import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        //area = a * h / 2
        double area = a * b / 2;
        System.out.printf("%.2f", area);
    }
}
