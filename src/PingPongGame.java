/**
 * Created by lloyd on 11/16/16.
 */

import java.util.Scanner;

public class PingPongGame {

    public static final int WINNING_SCORE = 7;

    public static void main(String[] args) {
        int playerScore = 0;
        int cpuScore = 0;
        Scanner input = new Scanner(System.in);

        do {
            // User turn
            Side playerSide = selectTableSide(input);
            Side cpuSide = chooseRandomSide();
            if (isGuessCorrect(playerSide, cpuSide)) {
                playerScore += playerSide.getPoints();
            }
            showScores(playerScore, cpuScore);

            // CPU turn
            cpuSide = chooseRandomSide();
            playerSide = guessTableSide(input);
            if (isGuessCorrect(playerSide, cpuSide)) {
                cpuScore += cpuSide.getPoints();
            }
            showScores(playerScore, cpuScore);

        } while (isGameOver(playerScore, cpuScore));

        if (isWinner(playerScore)) {
            System.out.println("Player won!!!");
        } else {
            System.out.println("CPU won!!!");
        }
        input.close();
    }

    private static boolean isWinner(int playerScore) {
        return playerScore == WINNING_SCORE;
    }

    /**
     * A game is over if any of the players have `WINNING_SCORE` points
     */
    private static boolean isGameOver(int playerScore, int cpuScore) {
        return playerScore < WINNING_SCORE && cpuScore < WINNING_SCORE;
    }

    private static Side chooseRandomSide() {
        return Math.round(Math.random()) == 0 ? Side.LEFT : Side.RIGHT;
    }

    private static void showScores(int playerScore, int cpuScore) {
        System.out.println(
                "Player score is " + playerScore + ", CPU score is " + cpuScore
        );
    }

    private static boolean isGuessCorrect(Side guess, Side correct) {
        return correct.equals(guess);
    }

    private static Side guessTableSide(Scanner input) {
        String side;
        System.out.println(
                "What side of the table the ball is going to? (left or right)"
        );
        side = input.next();
        return convertToSide(side);
    }

    private static Side selectTableSide(Scanner input) {
        System.out.println(
                "What side of the table you would like to swing? (left or right)"
        );
        String side = input.next();
        return convertToSide(side);
    }

    private static Side convertToSide(String side) {
        return "left".equalsIgnoreCase(side) ? Side.LEFT : Side.RIGHT;
    }
}