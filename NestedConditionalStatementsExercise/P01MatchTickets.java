package NestedConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double budgetTrip = 0;

        if (count <= 4) {
            budgetTrip = budget * 0.75;
        } else if (count <= 9) {
            budgetTrip = budget * 0.60;
        } else if (count <= 24) {
            budgetTrip = budget * 0.50;
        } else if ( count <= 49) {
            budgetTrip = budget * 0.4;
        } else {
            budgetTrip = budget * 0.25;
        }
        double endBudget = budget - budgetTrip;
        if (category.equals("VIP")) {
            endBudget = endBudget - (count *499.99);
        } else {
            endBudget = endBudget - (count * 249.99);
        }
        if (endBudget >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", endBudget);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(endBudget));
        }
    }
}
