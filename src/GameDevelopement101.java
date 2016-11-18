import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by lloyd on 11/16/16.
 */
//  Hi or Low app

public class GameDevelopement101 {
    public static void main(String[] args) {
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"
        Scanner sc = new Scanner(System.in);
        java.lang.String userWantsToContinue;

        do {
            playHighLowGame();
            System.out.println("Do you want to play again? y/n");
            userWantsToContinue = sc.next();
        } while (userWantsToContinue.equalsIgnoreCase("y") || userWantsToContinue.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing, yay!");
    }

    public static void playHighLowGame(){
        int random;
        int userGuess;

        random = getRandomNumber();

        do {
            userGuess = getUserGuess();

            System.out.println("The game guessed " + random);

            if (random > userGuess) {
                System.out.println("HIGHER!");
            } else {
                System.out.println("LOWER!");
            }
        }
        while (random != userGuess);
        System.out.println("Good Guess!");
    }
    public static int getRandomNumber() {
        return (int) Math.ceil(Math.random() * 100);
    }

    public static int getUserGuess() {

        int userInput = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please guess a number betwee 1 and 100: ");

        try {
            userInput = sc.nextInt();
            if (userInput < 1 || userInput > 100) {
                throw new InputMismatchException("Guess must be an integer between 1 and 100");
            }
            return userInput;
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return userInput;
        }

    }

}
