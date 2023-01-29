package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int result = 0;
        double resultDivide = 0;

        if (symbol.equals("+")) {
            result = num1 + num2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", num1, symbol, num2, result);
            } else {
                System.out.printf("%d %s %d = %d - odd", num1, symbol, num2, result);
            }
        } else if (symbol.equals("-")) {
            result = num1 - num2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", num1, symbol, num2, result);

            } else {
                System.out.printf("%d %s %d = %d - odd", num1, symbol, num2, result);
            }
        } else if (symbol.equals("*")) {
            result = num1 * num2;
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", num1, symbol, num2, result);

            } else {
                System.out.printf("%d %s %d = %d - odd", num1, symbol, num2, result);
            }
        } else if (symbol.equals("/")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                resultDivide = (double)num1 / num2;
                System.out.printf("%d / %d = %.2f", num1, num2, resultDivide);
            }
        } else if (symbol.equals("%")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
            }
        }
        }
    }
