/**
 * Created by lloyd on 11/14/16.
 */
import java.util.Scanner;
public class TableOfPowers {
    public static void main(String[] args) {


        double number;
        String userInput = "n";

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer");
            number = sc.nextInt();

            System.out.println("Table of Squares");
            for (double i = 0; i <= number; i = i * i) {
                System.out.println(i);
            }
            System.out.println("Table of Cubes");



            System.out.print("Do you want to continue?");
            userInput = sc.next();
        }
        while (userInput.equals("y"));
    }
}
