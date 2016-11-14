import java.util.Scanner;

/**
 * Created by lloyd on 11/14/16.
 */
public class CalculateFactorial {
    public static void main(String[] args) {

        int integer;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        integer = sc.nextInt();

        do {
            System.out.print("Please enter a integer below 20: ");
            integer = sc.nextInt();
        }
        while (integer >= 20);

        System.out.print(integer + "! = ");
        for (int i = 1; i <= integer; i++){
            if (i < 4) {
                System.out.print(i + " x ");
            }
            else {
                System.out.print(i + " = ");
            }
        }
        System.out.println(myFactorial(integer));

    }
    public static int myFactorial( int integer)
    {
        if( integer == 1)
            return 1;
        else
        {
            return(integer*(myFactorial(integer-1)));
        }
    }
}
