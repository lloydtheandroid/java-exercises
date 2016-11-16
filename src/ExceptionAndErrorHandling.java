import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by lloyd on 11/15/16.
 */
public class ExceptionAndErrorHandling {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String name = getStudentName(input);
        int age = getStudentAge(input);
        String why = getStudentWhy(input);


        System.out.println("Name is " + name);
        System.out.println();
        System.out.println("Age is " + age);
        System.out.println();
        System.out.println("Reason for school is " + why);
        System.out.println();

        System.out.println("Do you want to enter another student? (y/n)");
        String newStudent = input.next();
        if (newStudent.equalsIgnoreCase("y")) {
            main(null);
        }
    }
    public static String getStudentName(Scanner input) {

        String studentName;
        try {
            System.out.print("What is the student's Name? ");
            studentName = input.next();
            if (studentName.trim().isEmpty()){
                throw new IllegalArgumentException("Name cannot be blank");
            } return studentName;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getStudentName(input);
        }
    }
    public static int getStudentAge(Scanner input) {

        try {
            System.out.print("What is the student's Age? ");
            int age = input.nextInt();
            if(age < 0) {
                throw new IllegalArgumentException ("Age must be a positive number");
            }
            return age;

        } catch (InputMismatchException e) {
            input.next(); // discard the incorrectly entered value
            System.out.println("Error! Please enter a whole number. Try again.\n");
            return getStudentAge(input);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getStudentAge(input);
        }
    }
    public static String getStudentWhy(Scanner input) {

        try {
            System.out.println("Why does the student want to learn programming? ");
            String studentWhy = input.next();
            if (studentWhy.isEmpty()){
                throw new IllegalArgumentException("You reason cannot be empty");
            }return studentWhy;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getStudentWhy(input);
        }
    }
}

