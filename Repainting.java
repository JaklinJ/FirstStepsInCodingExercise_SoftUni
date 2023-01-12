import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nailon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        
        double sumNailon = (nailon + 2) * 1.5;
        double sumPaint = (paint + (paint * 0.1));
        double sumMaterials = (sumNailon + (sumPaint * 14.50) + (razreditel * 5.00) + 0.40);
        double pay = (sumMaterials * 0.3) * hours;
        double sum = sumMaterials + pay;
        System.out.printf("%f", sum);

    }
}
