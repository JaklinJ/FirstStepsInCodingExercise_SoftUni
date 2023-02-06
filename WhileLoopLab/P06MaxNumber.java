package WhileLoop;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!(number.equals("Stop"))) {
            int input = Integer.parseInt(number);
            if (input > maxNumber) {
                maxNumber = input;
            }
            number = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}
