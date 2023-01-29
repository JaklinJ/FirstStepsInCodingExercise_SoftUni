package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String grade = scanner.nextLine();
        double price =0;
        /* § "room for one person" – 18.00 лв за нощувка
           § "apartment" – 25.00 лв за нощувка
           § "president apartment" – 35.00 лв за нощувк */
        switch (typeRoom) {
            case "room for one person":
                price = 18.0;
                break;
            case "apartment":
                price = 25.0;
                break;
            case "president apartment":
                price = 35.0;
                break;
        }
        double endPrice = (days - 1) * price;
        if (days < 10 ) {
            if (typeRoom.equals("room for one person")) {
                endPrice = endPrice * 1;
            } else if (typeRoom.equals("apartment")) {
                endPrice = endPrice * 0.7;
            } else {
                endPrice = endPrice * 0.9;
            }
        } else if (days > 10 && days <= 15) {
            if (typeRoom.equals("room for one person")) {
                endPrice = endPrice * 1;
            } else if (typeRoom.equals("apartment")) {
                endPrice = endPrice * 0.65;
            } else {
                endPrice = endPrice * 0.85;
            }
        } else {
            if (typeRoom.equals("room for one person")) {
                endPrice = endPrice* 1;
            } else if (typeRoom.equals("apartment")) {
                endPrice = endPrice * 0.5;
            } else {
                endPrice = endPrice * 0.8;
            }
        }
        if (grade.equals("positive")) {
            endPrice = endPrice + (endPrice*0.25);
        } else {
            endPrice = endPrice * 0.9;
        }
        System.out.printf("%.2f", endPrice);
    }
}
