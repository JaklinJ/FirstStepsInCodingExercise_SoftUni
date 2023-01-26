package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double endPrice = 0;

        if (flowers.equals("Roses")) {
            if(count > 80) {
                price = (count * 5.0);
                endPrice = price * 0.9;
            } else {
                endPrice = count * 5.0;
            }
        } else if (flowers.equals("Dahlias")) {
            if (count > 90) {
                price = count * 3.8;
                endPrice = price * 0.85;
            } else {
                endPrice = count * 3.8;
            }
        } else if (flowers.equals("Tulips")) {
            if (count > 80) {
                price = count * 2.8;
                endPrice = price * 0.85;
            } else {
                endPrice = count * 2.8;
            }
        } else if (flowers.equals("Narcissus")) {
            if (count < 120) {
                price = count * 3.0;
                endPrice = price + (price*0.15);
            } else {
                endPrice = count * 3.0;
            }
        } else if (flowers.equals("Gladiolus")) {
            if (count < 80) {
                price = count * 2.5;
                endPrice = price + (price * 0.2);
            } else {
                endPrice = count * 2.5;
            }
        }
        double diff = budget - endPrice;
        if (diff >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count
            , flowers , diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(diff));
        }
    }
}
