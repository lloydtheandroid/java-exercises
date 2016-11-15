import java.util.Scanner;
/**
 * Created by lloyd on 11/11/16.
 */

public class ConsoleIo {

    public static void main(String[]args){

        String userInput1, userInput2, userInput3, userInput4;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first word: ");
        userInput1 = sc.nextLine();

        System.out.print("Enter your second word: ");
        userInput2 = sc.nextLine();

        System.out.print("Enter your third word: ");
        userInput3 = sc.nextLine();

        System.out.println("You entered : " + userInput1 + " " + userInput2 + " " + userInput3 );

        System.out.print("Enter a sentence: ");
        String userInput = sc.nextLine();
        String arr[] = userInput.split(" ");
        String firstWord = arr[0];
        String secondWord = arr[1];
        String thirdWord = arr[2];

        System.out.println("Your first word is " + firstWord);
        System.out.println("Your second word is " + secondWord);
        System.out.println("Your third word is " + thirdWord);


        double length, width;
        length = 0;
        width = 0;
        do {
            Scanner lw = new Scanner(System.in);

            System.out.print("Enter the length: ");
            length = lw.nextDouble();

            System.out.print("Enter the width: ");
            width = lw.nextDouble();

            System.out.print("Do you wnato to calculate another room?");
            userInput = lw.next();

        } while (userInput.equals("y"));
        System.out.println("Thank you for using the room calculator");
    }
//    public static double perimeter( double width, double length) {
//        return 2 * width + 2 * length;
//    }
//    public static double area( double width, double length) {
//        return width * length
//    }
}
