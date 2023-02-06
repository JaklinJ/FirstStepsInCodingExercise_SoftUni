package WhileLoop;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String pass = scanner.nextLine();

        String passInput = scanner.nextLine();

        while (!(passInput.equals(pass))) {
            passInput = scanner.nextLine();

        }
        System.out.printf("Welcome %s!", userName);
    }
}
