package NestedConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String classs = "";
        String typeCar = "";

        if (budget <= 100) {
            classs = "Economy class";
            switch (season) {
                case "Summer":
                    typeCar = "Cabrio";
                    budget = budget * 0.35;
                    break;
                case "Winter":
                    typeCar = "Jeep";
                    budget = budget * 0.65;
                    break;
            }
        } else if (budget <= 500) {
            classs = "Compact class";
            switch (season) {
                case "Summer":
                    typeCar = "Cabrio";
                    budget = budget * 0.45;
                    break;
                case "Winter":
                    typeCar = "Jeep";
                    budget = budget * 0.80;
                    break;
            }
        } else {
            classs = "Luxury class";
            typeCar = "Jeep";
            budget = budget * 0.9;
        }
        System.out.println(classs);
        System.out.printf("%s - %.2f", typeCar, budget);

    }
}
