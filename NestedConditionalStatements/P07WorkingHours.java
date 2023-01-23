package NestedConditionalStatements;

import java.util.Objects;
import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        boolean isTrue = (hours >= 10 && hours <= 18);
        boolean isTrueDay = (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
         || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday"));
        if (isTrue && isTrueDay) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
