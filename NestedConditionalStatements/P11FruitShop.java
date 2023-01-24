package NestedConditionalStatements;

        import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        boolean isTrue = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday");
        boolean isTrueWeekends = day.equals("Saturday") || day.equals("Sunday");


        double price = 0;
        double endResult =0;
        if (isTrue) {
            if (fruit.equals("banana")) {
                price = 2.50;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("apple")) {
                price = 1.20;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("orange")) {
                price = 0.85;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("kiwi")) {
                price = 2.7;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("pineapple")) {
                price = 5.5;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("grapes")) {
                price = 3.85;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else {
                System.out.println("error");
            }
        } else if (isTrueWeekends) {
            if (fruit.equals("banana")) {
                price = 2.70;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("apple")) {
                price = 1.25;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("orange")) {
                price = 0.90;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("kiwi")) {
                price = 3.0;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("pineapple")) {
                price = 5.6;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else if (fruit.equals("grapes")) {
                price = 4.20;
                endResult = price*count;
                System.out.printf("%.2f",endResult);
            } else {
                System.out.println("error");
            }

        } else if (!isTrueWeekends || !isTrue) {
            System.out.println("error");
        }
    }
}
