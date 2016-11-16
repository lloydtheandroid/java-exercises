import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by lloyd on 11/15/16.
 */
public class ExceptionAndErrorHandling {
    public static void main(String[] args) {

        String name = "";
        int age = 0;
        String why = "";


        System.out.println("Name is " + getStudentName(name));
        System.out.println("Age is " + getStudentAge(age));
        System.out.println("Reason for school is " + getStudentWhy(why));
    }
    public static String getStudentName(String studentName) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("What is the student's Name? ");
            studentName = sc.next();
        } catch (InputMismatchException e) {
            sc.next();  // discard the incorrectly entered value
            System.out.println("Error! Invalid Name. Try again.\n");
        }
        System.out.println(); // Blank line for formatting
        return studentName;
    }
    public static int getStudentAge(int studentsAge) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("What is the student's Age? ");
            studentsAge = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.next(); // discard the incorrectly entered value
            System.out.println("Error! Please enter a whole number. Try again.\n");
        }
        System.out.println(); // Blank line for formatting
        return studentsAge;
    }
    public static String getStudentWhy(String studentWhy) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Why does the student want to learn programming? ");
            studentWhy = sc.nextLine();
            if (studentWhy.equalsIgnoreCase("")){
                getStudentWhy(studentWhy);
            }

        } catch (InputMismatchException e) {
            sc.next(); // discard the incorrectly entered value
            System.out.println("Error! Please enter a sentence. Try again.\n");
        }
        return studentWhy;
    }
}