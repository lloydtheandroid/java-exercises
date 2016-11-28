import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lloyd on 11/28/16.
 */
public class StudentRecordApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student jb = new Student("John", "Brown", 98);
        Student bj = new Student("Ben", "Jonson", 68);
        Student sd = new Student("Sam", "Davis", 78);

        students.add(jb);
        students.add(bj);
        students.add(sd);

        for(Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " score is: " + student.score);
        }



//        //constructor is function that is called the returns a new object
//
//
//
//            ArrayList<Student> students = new ArrayList<>();
//
//            //prompt user for input
//            //how many students
//            //then instantiate or create that many student objects
//
//            System.out.println("Welcome to the student records application");
//            do {
//
//
//                // create the student object
//                System.out.print("Please input the student's first name: ");
//                firstName = sc.next();
//
//                System.out.print("Please input the student's last name: ");
//                lastName = sc.next();
//
//                System.out.println("Please input that student's score: ");
//                score = sc.nextInt();
//
//                // create a new student object to hold the data for a single student.
//                Student newStudent = new Student(firstName, lastName, score);
//
//                // put the newStudent object onto the ArrayList
//                students.add(newStudent);
//
//                System.out.print("Do you want to add another student? ");
//                addMoreStudents = sc.next();
//
//
//            } while (addMoreStudents.equalsIgnoreCase("y"));
    }
}
