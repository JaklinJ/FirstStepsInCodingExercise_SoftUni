package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApp = 0;

        switch (month) {
            case "May":
            case "October":
            priceStudio = nights * 50.0;
            priceApp = nights * 65.0;
            break;
            case "June":
            case "September":
                priceStudio = nights * 75.2;
                priceApp = nights * 68.7;
                break;
            case "July":
            case "August":
                priceStudio = nights * 76;
                priceApp = nights * 77;
                break;
        }
        boolean isValid = month.equals("May") || month.equals("October");


        if (isValid) {
            if (nights > 7 && nights < 14) {
                priceStudio = priceStudio * 0.95;
            } else if (nights > 14) {
                priceStudio = priceStudio * 0.7;
            }
        } else if (month.equals("June") || month.equals("September") && nights > 14) {
            priceStudio = priceStudio * 0.8;
        }
        if (nights > 14) {
            priceApp = priceApp * 0.9;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApp);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
