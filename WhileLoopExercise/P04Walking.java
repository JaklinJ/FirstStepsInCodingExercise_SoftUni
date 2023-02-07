package WhileLoopExercies;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String steps = scanner.nextLine();

        int sum = 0;
        while (!steps.equals("Going home")) {
            int input = Integer.parseInt(steps);
            sum += input;
            if (sum >= 10000) {
                break;
            }

            steps = scanner.nextLine();
        }

        int res = 0;
        if (steps.equals("Going home")) {
            int stepsHome = Integer.parseInt(scanner.nextLine());
            sum += stepsHome;
        }
        if (sum < 10000) {
            res = 10000 - sum;
            System.out.printf("%d more steps to reach goal.%n", res);
        } else {
            res = sum - 10000;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!%n", res);
        }
    }
}
