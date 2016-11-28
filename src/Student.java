import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lloyd on 11/28/16.
 */
// The application accepts last name, first name, and score for one or more students and stores the results in an array.
// The application prints the student name and their score alphabetically by last name.
// The program should implement a class called Student that stores last name, first name, and score for each student.
// The class should implement the Comparable interface so that students can be sorted by name.
// The program should you an Array to store Student objects. It should sort the array prior to printing the student list.
// Validate user input so that the number of students can only be a positive integer, the last name and first name
// values cannot be empty Strings, and the score is an integer from 0 and 100.
public class Student {
    String firstName;
    String lastName;
    int score;

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;

    }
}
