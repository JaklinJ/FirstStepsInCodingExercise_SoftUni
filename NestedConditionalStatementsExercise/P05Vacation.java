package NestedConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String place = "";

        if (budget <= 1000) {
            place = "Camp";
            switch (season){
                case "Summer":
                    location = "Alaska";
                    budget = budget * 0.65;
                    break;
                case "Winter":
                    location = "Morocco";
                    budget = budget * 0.45;
            }
        }else if (budget <= 3000) {
            place = "Hut";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    budget = budget * 0.80;
                    break;
                case "Winter":
                    location = "Morocco";
                    budget = budget * 0.60;
            }
        }else {
            place = "Hotel";
                switch (season) {
                    case "Summer":
                        location = "Alaska";
                        budget = budget * 0.9;
                        break;
                    case "Winter":
                        location = "Morocco";
                        budget = budget * 0.9;
                }
        }
        System.out.printf("%s - %s - %.2f", location,place,budget);
    }
}
