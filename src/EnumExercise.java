import java.util.Scanner;

/**
 * Created by lloyd on 11/21/16.
 */
//# Enum exercise
//
//        Implement the JS exercise using Java enums, instead of numbers,
//        use colors. Use an enum for the colors.
//
//        If your lucky color is red you have no discount,
//        if your lucky color is blue you'll get a 10% discount,
//        if it's yellow, discount is 25%,
//        if it's green, discount is 35%,
//        if it's purple, 50%, and
//        if it's pink you'll get all for free!.
//
//        Ask for the original amount to pay, then show the total amount to pay
//        after the discount.
//
//        The enum should have a property `discountPercentage` and a method
//        `applyDiscount(double payment)`. For instance:
//
//        `Color.RED.applyDiscount(payment);`
//
//        Repeat this process if there are more customers.

public class EnumExercise {
    public static void main(String[] args) {



    }
    public static double convertColorToDiscount(String color){
        if (color.equalsIgnoreCase("RED")){
            return (double) 1;
        }else if (color.equalsIgnoreCase("BLUE")){
            return .9;
        }if (color.equalsIgnoreCase("YELLOW")){
            return .75;
        }if (color.equalsIgnoreCase("GREEN")){
            return .65;
        }if (color.equalsIgnoreCase("PURPLE")){
            return .50;
        }else {
            return 0;
        }
    }
}




