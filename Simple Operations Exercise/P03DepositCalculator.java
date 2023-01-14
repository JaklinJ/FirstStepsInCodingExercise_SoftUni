import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double yearPercent = Double.parseDouble(scanner.nextLine());

        double deposit = (depositSum * yearPercent / 100) / 12;
        double sum = depositSum + months * deposit;


        System.out.println(sum);
    }
}
