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

        double payment;
        double discount;
        String discountInformation;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your total before the discount: ");
        payment = sc.nextDouble();

        // Get a random number between 1 and 6 (inclusive)
        int random = (int) Math.ceil(Math.random() * 6);

        if(random == 1) {
            discount = DiscountColor.RED.applyDiscount(payment);
        } else if(random == 2) {
            discount = DiscountColor.BLUE.applyDiscount(payment);
        } else if(random == 3) {
            discount = DiscountColor.YELLOW.applyDiscount(payment);
        } else if(random == 4) {
            discount = DiscountColor.GREEN.applyDiscount(payment);
        } else if (random == 5) {
            discount = DiscountColor.PURPLE.applyDiscount(payment);
        } else {
            discount = DiscountColor.PINK.applyDiscount(payment);
        }

        discountInformation = outputDiscount(payment, discount);

        System.out.println(discountInformation);

        sc.close();
    }

    protected static String outputDiscount(double payment, double discount) {
        double total = payment - discount;
        return "The discount for $" + payment + " is $" + discount + " for a grand total of $" + total;
    }
}