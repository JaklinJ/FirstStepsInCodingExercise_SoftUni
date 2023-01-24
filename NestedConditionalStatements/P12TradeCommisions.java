package NestedConditionalStatements;

import java.util.Scanner;

public class P12TradeCommisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double num = Double.parseDouble(scanner.nextLine());

        boolean isTrueTown = town.equals("Sofia") || town.equals("Varna") || town.equals("Plovdiv");
        double commission =0;
        if (isTrueTown) {
            if (town.equals("Sofia")) {
                if (0 <= num && num <= 500) {
                    commission = num * 0.05;
                    System.out.printf("%.2f", commission);
                } else if (500 < num && num <= 1000)  {
                    commission = num * 0.07;
                    System.out.printf("%.2f", commission);
                } else if (1000 < num && num <= 10000) {
                    commission = num * 0.08;
                    System.out.printf("%.2f", commission);
                } else if (num > 10000) {
                    commission = num * 0.12;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
            } else if (town.equals("Varna")) {
                if (0 <= num && num <= 500) {
                    commission = num * 0.045;
                    System.out.printf("%.2f", commission);
                } else if (500 < num && num <= 1000)  {
                    commission = num * 0.075;
                    System.out.printf("%.2f", commission);
                } else if (1000 < num && num <= 10000) {
                    commission = num * 0.1;
                    System.out.printf("%.2f", commission);
                } else if (num > 10000) {
                    commission = num * 0.13;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }

            } else if (town.equals("Plovdiv")) {
                if (0 <= num && num <= 500) {
                    commission = num * 0.055;
                    System.out.printf("%.2f", commission);
                } else if (500 < num && num <= 1000)  {
                    commission = num * 0.08;
                    System.out.printf("%.2f", commission);
                } else if (1000 < num && num <= 10000) {
                    commission = num * 0.12;
                    System.out.printf("%.2f", commission);
                } else if (num > 10000) {
                    commission = num * 0.145;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
            }
        } else {
            System.out.println("error");
        }
    }
}
