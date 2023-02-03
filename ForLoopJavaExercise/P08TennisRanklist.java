package ForLoopJavaExercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int firstPoints = Integer.parseInt(scanner.nextLine());

        double percentWin = 0;
        int points = 0;
        for (int i = 1; i <= countTournaments; i++) {
            String tournamentPlace = scanner.nextLine();
            switch (tournamentPlace) {
                case "W":
                    points = points + 2000;
                    percentWin = percentWin + 1;
                    break;
                case "F":
                    points = points + 1200;
                    break;
                case "SF":
                    points = points + 720;
            }
        }
        int endSum = firstPoints + points;
        int middleSum = points / countTournaments;
        percentWin = (percentWin / countTournaments) * 100.0;

        System.out.printf("Final points: %d%n", endSum);
        System.out.printf("Average points: %d%n", middleSum);
        System.out.printf("%.2f", percentWin);
        System.out.println("%");
    }
}

