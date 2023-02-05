package NestedConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double monthlyKm = Double.parseDouble(scanner.nextLine());

        double pay = 0;

        if (monthlyKm <= 5000) {
            switch (season) {
                case "Spring" :
                    pay = (monthlyKm * 0.75) * 4.0;
                    break;
                case "Autumn" :
                    pay = (monthlyKm * 0.75) * 4;
                    break;
                case "Summer":
                    pay = (monthlyKm * 0.9) * 4.0;
                    break;
                case "Winter":
                    pay = (monthlyKm * 1.05) * 4;
                    break;
            }
        } else if (monthlyKm <= 10000) {
            switch (season) {
                case "Spring":
                    pay = (monthlyKm * 0.95) * 4.0;
                    break;
                case "Autumn":
                    pay = (monthlyKm * 0.95) * 4.;
                    break;
                case "Summer":
                    pay = (monthlyKm * 1.10) * 4.0;
                    break;
                case "Winter":
                    pay = (monthlyKm * 1.25) * 4;
                    break;
            }
        } else {
            pay = ( monthlyKm * 1.45) * 4;
        }
        pay = pay * 0.9;
        System.out.printf("%.2f", pay);
    }
}
