import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by lloyd on 11/28/16.
 */
public class StudentRecordApp {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String addAnotherStudent;
        String firstName;
        String lastName;
        int score;

        do {
            System.out.print("Please enter Student's first name : ");
            firstName = sc.next();
            System.out.print("Please enter Student's last name: ");
            lastName = sc.next();
            System.out.print("Please enter Student's score: ");
            score = sc.nextInt();
            students.add(new Student(firstName, lastName, score));

            System.out.println("Do you want to add another Student yes/no?");
            addAnotherStudent= sc.next();

        } while (addAnotherStudent.equals("y"));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student2, Student student1)
            {

                return  student1.lastName.compareTo(student2.lastName);
            }
        });
        System.out.println("Students are" + students);
        for(Student student : students) {
        System.out.println(student.lastName + " " + student.firstName + " Score is: " + student.score);
        }
    }
}



