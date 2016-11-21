import java.util.Scanner;

/**
 * Created by lloyd on 11/21/16.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] firstName = {"Dirk", "Tango", "Squanchy", "Jesus", "Dude", "Turbo", "Django", "Rambo", "Mufassa", "Doctor"};
        String[] lastName = {"Diggler", "McNugget", "Masters", "DeJesus", "Randerson", "Slamberson", "Frenchfry", "Rainbow", "Hogswoggle", "Killmore"};
        Scanner sc = new Scanner(System.in);
        String userInput;


        do {
            System.out.println("Your random name is " + firstName[randomNumber()] + " " + lastName[randomNumber()]);
            System.out.println("Do you want to get another random name? yes/no ");
            userInput = sc.next();
        }
        while (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));
        sc.close();
    }
    public static int randomNumber(){
        return (int) Math.ceil(Math.random() * 10 -1);
    }
}
