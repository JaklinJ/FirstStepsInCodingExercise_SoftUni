package WhileLoopExercies;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int unsatisfactoryGrades = Integer.parseInt(scanner.nextLine());


        int count = 0;
        double sum = 0;
        double avgSum = 0;
        int badCount = 0;
        boolean isFailed = true;
        String lastProblem = "";

        while (badCount < unsatisfactoryGrades) {
            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                badCount++;
            }
            sum += grade;
            count++;
            lastProblem = problemName;
            avgSum = sum/count;
        }
            if (isFailed) {
                System.out.printf("You need a break, %d poor grades.%n", badCount);
            } else {
                System.out.printf("Average score: %.2f%n", avgSum);
                System.out.printf("Number of problems: %d%n", count);
                System.out.printf("Last problem: %s%n", lastProblem);
            }

    }
}
