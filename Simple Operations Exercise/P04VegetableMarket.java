import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Градинар продавал реколтата от градината си на зеленчуковата борса. Продава зеленчуци за N лева на килограм
        и плодове за M лева за килограм. Напишете програма, която да пресмята приходите от реколтата в евро
        ( ако приемем, че едно евро е равно на 1.94лв).
Вход
От конзолата се четат 4 числа, по едно на ред:
•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]
*/
        double vegPriceKg = Double.parseDouble(scanner.nextLine());
        double fruitPriceKg = Double.parseDouble(scanner.nextLine());
        int sumPriceVeg = Integer.parseInt(scanner.nextLine());
        int sumPriceFruit = Integer.parseInt(scanner.nextLine());

        double sum = (vegPriceKg * sumPriceVeg) + (fruitPriceKg * sumPriceFruit);
        double sumEuro = sum / 1.94;
        System.out.printf("%.2f", sumEuro);
    }
}
