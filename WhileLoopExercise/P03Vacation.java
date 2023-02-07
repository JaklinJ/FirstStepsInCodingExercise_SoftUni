package WhileLoopExercies;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double presentMoney = Double.parseDouble(scanner.nextLine());

        int daysPassed = 0;
        int daysSpending = 0;
        boolean isSaved = true;
        while (neededMoney > presentMoney && daysSpending < 5) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysPassed++;
            if (action.equals("spend")) {
                presentMoney -= money;
                daysSpending+= 1;
            } else {
                presentMoney += money;
                daysSpending = 0;
            }

            if (presentMoney < 0) {
                presentMoney = 0;
            }
        }
        if (daysSpending >= 5) {
            isSaved = false;
        }
            if (isSaved) {
                System.out.printf("You saved the money for %d days.%n",daysPassed);
            } else {
                System.out.println("You can't save the money.");
                System.out.printf("%d%n", daysPassed);
            }
    }
}
