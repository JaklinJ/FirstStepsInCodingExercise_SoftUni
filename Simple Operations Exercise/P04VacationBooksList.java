import java.sql.SQLOutput;
import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int total = pages / pagesPerHour;
        int daysTotal = total / days;
        System.out.println(daysTotal);
    }
}
