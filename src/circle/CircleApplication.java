package circle;

import java.util.Scanner;
import validation.DoubleInRange;
import java.io.PrintStream;
import console.Console;
import validation.NonEmptyString;


/**
 * Created by lloyd on 11/30/16.
 */
public class CircleApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PrintStream output = System.out;
        Console console = new Console(sc, output);
        String anotherCircle;

        do {
            double radius = console.askForDouble(
                    "Please enter a radius between 1 and 1000: ",
                    new DoubleInRange(0, 1000)
            );

            Circle circle = new Circle(radius);

            output.println("Your input radius is: " + radius);

            output.print("The circumference of the circle is: ");

            output.printf("%.2f%n", +circle.getCircumference(radius));
            output.println();
            output.print("The area of the circle is: ");
            output.printf("%.2f%n", +circle.getArea(radius));

            anotherCircle = console.askForText(
                    "Do you want to calculate another circle? (y/n): ",
                    new NonEmptyString()
            );

        }while (anotherCircle.equalsIgnoreCase("y"));


//        System.out.println("The circumference is " + circumference);
//
//        System.out.println("The area of the circle is " + area);




    }
}
