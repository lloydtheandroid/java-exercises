import java.util.ArrayList;


/**
 * Created by lloyd on 11/28/16.
 */
public class StudentArrayList {
    // make an arrayList where each element on the list is a Student object
    ArrayList<Student> students = new ArrayList<>();

// create the student object
 System.out.print("Please input the student's first name: ");
    firstName = sc.nextLine();

System.out.print("Please input the student's last name: ");
    lastName = sc.nextLine();

System.out.println("Please input that student's score: ");
    score = sc.nextInt();

    // create a new student object to hold the data for a single student.
    Student newStudent = new Student(firstName, lastName, score);

// put the newStudent object onto the ArrayList
students.add(newStudent);
}
