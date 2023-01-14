import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());

        double endPrice = (dogFood * 2.50) + (catFood * 4.0);

        System.out.printf("%.2f lv.", endPrice);
    }
}