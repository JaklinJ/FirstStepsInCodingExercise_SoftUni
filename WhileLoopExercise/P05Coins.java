package WhileLoopExercies;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double totalCoins = Math.floor(change * 100);
        int count = 0;

        while (totalCoins > 0) {
            if (totalCoins >= 200) {
                count += 1;
                totalCoins -= 200;
            } else if (totalCoins >= 100) {
                count += 1;
                totalCoins -= 100;
            } else if (totalCoins >= 50) {
                count += 1;
                totalCoins -= 50;
            } else if (totalCoins >= 20) {
                count += 1;
                totalCoins -= 20;
            } else if (totalCoins >= 10) {
                count += 1;
                totalCoins -= 10;
            } else if (totalCoins >= 5) {
                count += 1;
                totalCoins -= 5;
            } else if (totalCoins >= 2) {
                count += 1;
                totalCoins -= 2;
            } else if (totalCoins >=1) {
                count += 1;
                totalCoins -= 1;
            }
        }
        System.out.println(count);
    }
}
