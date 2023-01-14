import java.util.Scanner;

public class P10WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    /* Напишете програма, която при въведени градуси (реално число) принтира какво е времето,
    като имате предвид следната таблица:

       Градуси	Време
       26.00 - 35.00	Hot
       20.1 - 25.9	Warm
       15.00 - 20.00	Mild
       12.00 - 14.9	Cool
       5.00 - 11.9	Cold
       Ако се въведат градуси, различни от посочените в таблицата, да се отпечата "unknown". */

        double degrees = Double.parseDouble(scanner.nextLine());
        if (degrees >= 5 && degrees <= 11.9) {
            System.out.println("Cold");
        } else if (degrees >= 12.0 && degrees <= 14.9 ) {
            System.out.println("Cool");
        } else if (degrees >= 15.0 && degrees <= 20.0) {
            System.out.println("Mild");
        } else if (degrees >= 20.1 && degrees <= 25.9) {
            System.out.println("Warm");
        } else if (degrees >= 26.0 && degrees <= 35.0) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }


    }
}
