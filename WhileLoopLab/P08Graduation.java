package WhileLoop;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int grade = 1;
        int count = 0;
        double sum = 0;

        while (grade <= 12) {
            double grades = Double.parseDouble(scanner.nextLine());
            grade++;
            if (grades < 4) {
                count = count +1;
                grade--;
            }
            if (count ==2) {
                break;
            }
            sum = sum + grades;

        }
        if (count<2) {
            sum = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, sum);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        }
    }
}
