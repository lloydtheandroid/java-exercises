import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * Created by lloyd on 11/21/16.
 */
//Calculate the batting average and slugging percentage for one or more baseball/softball players.
//First ask for the number of at bats.
//For each at bat, ask the user for the number of bases earned by the batter.
//After all of the at-bats are entered, display the batting average and slugging percentage of the batter.
//Use an Array to store the at-bat results for each player.
//Validate the input so that the user can only enter positive integers. For the at-bat results,
//        the user can only enter 0, 1, 2, 3, or 4.
//Validate the user’s response to the question "Another batter?" so that the user can only enter
//        Y, y, N, or n. If the user chooses N or n, end the program.
//Format the batting average and slugging percentages such that three decimal places are shown.
//Batting average is total number of at-bats for which the player earned at least one base divided
//        by the total number of at-bats.
//Slugging percentage is the total number of bases earned divided by the total number of at-bats.

public class BattingStatisticsCalculator {
    public static void main(String[] args) {
        int numberAtBats;
        int[] atBats;  // Declaring a variable

        Scanner scanner = new Scanner(System.in);

        String anotherBatter;
        do {
            System.out.println("Enter the number of at bats");
            numberAtBats = scanner.nextInt();
            atBats = new int[numberAtBats];

            for (int i = 0; i < atBats.length; i++) {
                System.out.println(
                        "How many bases the player earned at this bat?"
                );
                atBats[i] = getBasesEarned(scanner);
            }

            double battingAverage = calculateBattingAverage(atBats);
            double sluggingAverage = calculateSluggingAverage(atBats);

            System.out.printf(
                    "Batting average: %.3f, Slugging average: %.3f%n",
                    battingAverage,
                    sluggingAverage
            );

            anotherBatter = getAnotherBatter(scanner);

        } while ("y".equalsIgnoreCase(anotherBatter));
    }

    private static double calculateSluggingAverage(int[] atBats) {
        double sumOfBases = 0;
        for (int numberOfBases : atBats) {
            sumOfBases += numberOfBases;
        }
        return sumOfBases / atBats.length;
    }

    private static double calculateBattingAverage(int[] atBats) {
        double countOfHits = 0;
        for (int numberOfBases : atBats) {
            if (numberOfBases > 0) {
                countOfHits++;
            }
        }
        return countOfHits / atBats.length;
    }

    private static String getAnotherBatter(Scanner scanner) {
        System.out.println("Another Batter?");
        String anotherBatter = scanner.next();

        if (!"n".equalsIgnoreCase(anotherBatter)
                && !"y".equalsIgnoreCase(anotherBatter)) {
            return getAnotherBatter(scanner);
        }

        return anotherBatter;
    }

    private static int getBasesEarned(Scanner scanner) {
        try {
            int bases = scanner.nextInt();

            if (bases < 0 || bases > 4) {
                System.out.println("Please enter a number between 0 and 4");
                return getBasesEarned(scanner);
            }

            return bases;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
            return getBasesEarned(scanner);
        }
    }
}