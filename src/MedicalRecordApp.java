import sun.misc.Regexp;

import java.util.Scanner;

/**
 * Created by lloyd on 11/16/16.
 */
public class MedicalRecordApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String name;
        int age;
        String gender;
        String ssn;

        //Create a new medical
        MedicalRecord record = new MedicalRecord();

        System.out.print("What is the name? ");
        name = sc.next();
        record.setName(name);

        System.out.print("What is your age? ");
        age = sc.nextInt();
        record.setAge(age);

        System.out.print("What is your gender? ");
        gender = sc.next();
        record.setGender(gender);

        System.out.print("What is your Social Security Number (SSN)? ");
        ssn = sc.next();
        boolean isCorrect = ssn.matches("/(0-9){4}-(0-9){4}/");
        record.setSsn(ssn);

        System.out.println("Name is " + record.getName());

    }
}
