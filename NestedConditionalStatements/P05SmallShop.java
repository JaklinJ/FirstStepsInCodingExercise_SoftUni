package NestedConditionalStatements;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        String town = scanner.nextLine();
        double numberOfItems = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (town.equals("Sofia"))  {
            if (item.equals("coffee")) {
                price = 0.5;
            } else if (item.equals("water")) {
                price = 0.8;
            } else if (item.equals("beer")) {
                price = 1.20;
            } else if (item.equals("sweets")) {
                price = 1.45;
            } else if (item.equals("peanuts")) {
                price  = 1.60;
            }
        } else if (town.equals("Plovdiv")) {
            if (item.equals("coffee")) {
                price = 0.4;
            } else if (item.equals("water")) {
                price = 0.7;
            } else if (item.equals("beer")) {
                price = 1.15;
            } else if (item.equals("sweets")) {
                price = 1.30;
            } else if (item.equals("peanuts")) {
                price  = 1.50;
            }

        } else if (town.equals("Varna")) {
            if (item.equals("coffee")) {
                price = 0.45;
            } else if (item.equals("water")) {
                price = 0.7;
            } else if (item.equals("beer")) {
                price = 1.10;
            } else if (item.equals("sweets")) {
                price = 1.35;
            } else if (item.equals("peanuts")) {
                price  = 1.55;
            }

        }
        System.out.println(price * numberOfItems);
    }
}
