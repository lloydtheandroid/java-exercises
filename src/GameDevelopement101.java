import com.sun.org.apache.xpath.internal.operations.String;

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
        Scanner input = new Scanner(System.in);
        int randomNumber = getRandomNumber();
//        String highOrLow = isHighOrLow(randomNumber, input);

//        System.out.println(highOrLow);

    }
    public static int getRandomNumber() {
        return (int) Math.ceil(Math.random() * 100);
    }
//    public static String isHighOrLow(int randomNumber, Scanner input) {
//
//        String highLow;
//
//        System.out.println("What is your number? ");
//        int userGuess = input.nextInt();
//        if (userGuess < randomNumber) {
//            highLow += "Too Low";
//            return highLow;
//        }
//        else if (userGuess > randomNumber){
//        }
//    }
}
