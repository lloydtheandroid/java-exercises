import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lloyd on 11/28/16.
 */
public class StudentRecordApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String addMoreStudents;
        String firstName = "";
        String lastName = "";
        int score = 0;

        //prompt user for input
        //how many students
        //then instantiate or create that many student objects

        System.out.println("Welcome to the student records application");
        do {
            //Create a new student object
            Student newStudent = new Student(firstName, lastName, score);

            System.out.print("Please enter the student's first name: ");
            newStudent.firstName = sc.next();

            System.out.print("Please enter the student's last name: ");
            newStudent.lastName = sc.next();

            System.out.print("Please input that student's score: ");
            score = sc.nextInt();

            System.out.println("Do you want to add more students? ");
            addMoreStudents = sc.next();
            //Prompt user to continue
            // store users input to userInput variable


            //compare students scores java
            ArrayList<Student> studentList = new ArrayList<>();


        } while (addMoreStudents.equalsIgnoreCase("y"));

    }
}
