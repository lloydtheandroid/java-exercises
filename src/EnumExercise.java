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

        Scanner sc = new Scanner(System.in);
        double customerTotal = 0;
        int discount = randomNumber();


        System.out.print("What is the total?");
        customerTotal = sc.nextDouble();

        System.out.println(customerTotal);
        System.out.println(discount);
        System.out.println("Your Discount is " + getDiscount());

    }
    public static int randomNumber(){
        return (int) Math.ceil(Math.random() * 7);
    }
    public static DiscountColor getDiscount(DiscountColor color){
        color = randomNumber()
        switch (color){
            case 1 : RED;
                break;
            case 2 : BLUE;
                break;
            case 3 : GREEN;
                break;
            case 4 : PURPLE;
                break;
            case 5 : PINK;
                break;
        }
        return color;
    }
}
