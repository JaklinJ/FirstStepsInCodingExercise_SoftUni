import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veggie = Integer.parseInt(scanner.nextLine());

        double sumLunch = ((chicken * 10.35) + (fish * 12.40) + (veggie * 8.15));
        double dessert = sumLunch * 0.2;
        double sum = sumLunch + dessert + 2.5;
        System.out.printf("%f", sum);

    }
}
