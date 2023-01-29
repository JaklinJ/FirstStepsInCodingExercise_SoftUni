package NestedConditionalStatementsExercise;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minuteOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());

        int examMinutes = (hourOfExam*60)+minuteOfExam;
        int arrivalMinutes = (hourOfArrival*60)+minuteOfArrival;
        int diff = examMinutes - arrivalMinutes;
        int h = diff / 60;
        int m= diff % 60;

        if (diff >=0 && diff <= 30) {
            System.out.println("On time");
        } else if (diff < 0) {
            System.out.println("Late");
        } else {
            System.out.println("Early");
        }
        if (diff >= 1) {
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                System.out.printf("%d:%02d hours before the start", h, m);
            }
        }else if (diff < 0) {
            if (diff > -60) {
                System.out.printf("%d minutes after the start", Math.abs(diff));
            } else {
                System.out.printf("%d:%02d hours after the start", Math.abs(h),Math.abs(m));
            }
        }
    }
}
