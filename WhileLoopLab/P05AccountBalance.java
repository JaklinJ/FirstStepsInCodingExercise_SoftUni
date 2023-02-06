package WhileLoop;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String money = scanner.nextLine();

        double sum = 0;

        while (!(money.equals("NoMoreMoney"))) {
            double input = Double.parseDouble(money);
            if (input <= 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum = sum + input;
            System.out.printf("Increase: %.2f%n", input);

            money = scanner.nextLine();


        }
        System.out.printf("Total: %.2f%n", sum);
    }
}
