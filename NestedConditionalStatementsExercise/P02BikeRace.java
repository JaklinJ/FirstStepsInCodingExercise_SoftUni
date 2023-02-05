package NestedConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int junior = Integer.parseInt(scanner.nextLine());
        int senior = Integer.parseInt(scanner.nextLine());
        String trail = scanner.nextLine();

        int sumPeople = junior + senior;
        double tax = 0;

        switch (trail) {
            case "trail":
                tax = (junior * 5.50) + (senior * 7);
                break;
            case "cross-country":
                tax = (junior * 8) + (senior * 9.50);
                if (sumPeople >= 50) {
                    tax = tax * 0.75;
                }
                break;
            case "downhill":
                tax = (junior * 12.25) + (senior * 13.75);
                break;
            case "road":
                tax = (junior * 20) + (senior * 21.50);
                break;
        }
        tax = tax * 0.95;
        System.out.printf("%.2f", tax);
    }
}
