import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by lloyd on 11/15/16.
 */
public class ExceptionAndErrorHandling {
    public static void main(String[] args) {
        getStudentInfo();
    }
    public static void getStudentInfo() {

        String studentName = "";
        int studentsAge = 0;
        String studentWhy = "";
        String userInput;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Welcome to Codeup Student search! \n");

        do {
            try {
                System.out.print("What is the student's Name? ");
                studentName = sc.next();
            } catch (InputMismatchException e) {
                sc.next();  // discard the incorrectly entered value
                System.out.println("Error! Invalid Name. Try again.\n");
            }
            System.out.println(); // Blank line for formatting

            try {
                System.out.print("What is the student's Age? ");
                studentsAge = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next(); // discard the incorrectly entered value
                System.out.println("Error! Please enter a whole number. Try again.\n");
            }
            System.out.println(); // Blank line for formatting

            try {
                System.out.println("Why does the student want to learn programming? ");
                studentWhy = sc.nextLine();
                if(studentWhy.equals("")) {
                    System.out.println("Why does the student want to learn programming? ");
                    studentWhy = sc.nextLine();
                    throw new IllegalArgumentException("Please enter a valid statement");
                }
            } catch (InputMismatchException e) {
                sc.next(); // discard the incorrectly entered value
                System.out.println("Error! Please enter a sentence. Try again.\n");
            }
            System.out.println(); // Blank line for formatting
            System.out.println(studentName + " is " + studentsAge + " years old and wants to program because " + studentWhy);

            System.out.print("Do you want to look at another user? \"y/n\"\n");
            userInput = sc.nextLine();
        }
        while (userInput.equalsIgnoreCase("y"));
        System.out.println("Thank you for using the Student finder. ");
    }
}
