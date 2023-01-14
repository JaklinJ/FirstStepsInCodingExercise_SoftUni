import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumriaCenaKg = Double.parseDouble(scanner.nextLine());
        double cacaCenaKg = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int midiKg = Integer.parseInt(scanner.nextLine());

        /*•	Паламуд – 60% по-скъп от скумрията
          •	Сафрид – 80% по-скъп от цацата
          •	Миди – 7.50 лв. за килограм */
        double palamud = ((skumriaCenaKg + (skumriaCenaKg *0.6)) * palamudKg);
        double safrid = (( cacaCenaKg + (cacaCenaKg * 0.8)) * safridKg);
        double midi = midiKg * 7.50;
        double sum = palamud + safrid + midi;

        System.out.printf("%.2f", sum);
}
}