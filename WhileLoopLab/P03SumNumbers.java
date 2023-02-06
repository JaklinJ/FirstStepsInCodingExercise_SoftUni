package WhileLoop;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < num) {
            int num2 = Integer.parseInt(scanner.nextLine());

            sum = sum + num2;

        }
        System.out.println(sum);
    }
}
