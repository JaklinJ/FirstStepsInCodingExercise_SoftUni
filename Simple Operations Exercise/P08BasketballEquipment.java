import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoes = tax - tax * 0.4;
        double clothes = shoes - shoes * 0.2;
        double ball = clothes * 0.25;
        double accesories =  ball * 0.2;

        double sum = shoes + clothes + ball + accesories + tax;
        System.out.println(sum);

    }
}
