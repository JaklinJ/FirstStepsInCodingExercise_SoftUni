import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int length = Integer.parseInt(scanner.nextLine());
         int width = Integer.parseInt(scanner.nextLine());
         int height = Integer.parseInt(scanner.nextLine());
         double percent = Double.parseDouble(scanner.nextLine());

         double volume = ((length * width * height) / 1000.00);
         double litres = volume * (1 - (percent / 100));
        System.out.println(litres);
    }
}
