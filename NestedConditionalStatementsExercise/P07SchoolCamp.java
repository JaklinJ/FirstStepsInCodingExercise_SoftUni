package NestedConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        if (group.equals("boys")) {
            switch (season) {
                case "Summer":
                    price = (people * 15.0) * nights;
                    sport = "Football";
                    break;
                case "Spring":
                    price = (people * 7.20) * nights;
                    sport = "Tennis";
                    break;
                case "Winter":
                    price = (people * 9.60) * nights;
                    sport = "Judo";
                    break;
            }
        } else if (group.equals("girls")) {
            switch (season) {
                case "Summer":
                    price = (people * 15.0) * nights;
                    sport = "Volleyball";
                    break;
                case "Spring":
                    price = (people * 7.20) * nights;
                    sport = "Athletics";
                    break;
                case "Winter":
                    price = (people * 9.60) * nights;
                    sport = "Gymnastics";
                    break;
            }
        } else {
            switch (season) {
                case "Summer":
                    price = (people * 20.0) * nights;
                    sport = "Swimming";
                    break;
                case "Spring":
                    price = (people * 9.50) * nights;
                    sport = "Cycling";
                    break;
                case "Winter":
                    price = (people * 10.0) * nights;
                    sport = "Ski";
                    break;
            }
        }
        if (people >= 10 && people < 20) {
            price = price * 0.95;
        } else if (people >= 20 && people < 50) {
            price = price * 0.85;
        } else if (people >= 50) {
            price = price * 0.5;
        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}

