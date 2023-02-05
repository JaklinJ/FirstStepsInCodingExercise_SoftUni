package NestedConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrisantems = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double price = 0;
        int fullCount = countChrisantems + countRoses + countTulips;

        if (season.equals("Summer") || season.equals("Spring")) {
            price = (countChrisantems * 2.0) + (countRoses * 4.10) + (countTulips * 2.50);
            if (countTulips >= 7 && season.equals("Spring")) {
                price = price * 0.95;
            }
            if (holiday.equals("Y")) {
                price = price + (price * 0.15);
            }
        } else {
            price = (countChrisantems * 3.75) + (countRoses * 4.50) + (countTulips * 4.15);
            if (countRoses >= 10 && season.equals("Winter")) {
                price = price * 0.9;
            }
            if (holiday.equals("Y")) {
                price = price + (price * 0.15);
            }


        }
        if (fullCount >= 20) {
            price = price *0.8;
        }
        price = price + 2;
        System.out.printf("%.2f", price);
    }
}
