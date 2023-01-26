package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double rent = 0;

        switch (season) {
            case "Spring":
                rent = 3000.0;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200.0;
                break;
            case "Winter":
                rent = 2600.0;
                break;
        }

        if (count <= 6) {
            rent = rent * 0.9;
        } else if (count > 7 && count <= 11) {
            rent = rent * 0.85;
        } else {
            rent = rent * 0.75;
        }
        boolean isValid = count % 2 == 0 && !season.equals("Autumn");
        if (isValid) {
            rent = rent * 0.95;
        }


        double endRes =Math.abs(budget - rent);
        if (rent <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", endRes);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", endRes);
        }

    }
}
