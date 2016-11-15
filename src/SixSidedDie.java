import java.util.Scanner;

/**
 * Created by lloyd on 11/14/16.
 */
public class SixSidedDie {
    public static void main(String[] args) {

        int NumSides;
        int DieOne;
        int DieTwo;
        String userInput = "N";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("How many sides does your die have?: ");
            NumSides = sc.nextInt();

            DieOne = RollSixSidedDie(NumSides);
            DieTwo = RollSixSidedDie(NumSides);

            System.out.println("Die one is: " + DieOne + " and Die two is: " + DieTwo);

            System.out.print("Do you want to roll the Dice again? ");
            userInput = sc.next();
        }
        while (userInput.equals("y"));
    }
    private static int RollSixSidedDie(int NumSides) {
        return (int) Math.ceil(Math.random() * NumSides);
    }
}
