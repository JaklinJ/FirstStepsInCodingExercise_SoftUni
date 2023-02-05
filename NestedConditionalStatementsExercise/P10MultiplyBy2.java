package NestedConditionalStatementsMoreExercise;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            for (int i = 1; i <= Integer.MAX_VALUE; i++) {
                double currentNum = Double.parseDouble(scanner.nextLine());
                if (currentNum >= 0) {
                    double res = currentNum * 2.0;
                    System.out.printf("Result: %.2f%n", res);
                } else {
                    System.out.println("Negative number!");
                    break;
                }
            }
        }

    }

