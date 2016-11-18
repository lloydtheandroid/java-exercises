/**
 * Created by lloyd on 11/16/16.
 */
import java.util.Scanner;


// Class //
public class MedicalRecord {

    //Fields//

    public String name;
    public int age;
    public String gender;
    public String ssn;

    //Constructor//

    public MedicalRecord(String newName, int newAge, String newGender, String newSSN) {
        name = newName;
        age = newAge;
        gender = newGender;
        ssn = newSSN;
    }

    // Methods //
    public void setName(String newValue) {
        name = newValue;
    }
    public void setAge(int newValue) {
        age = newValue;
    }
    public void setGender(String newValue) {
        gender = newValue;
    }
    public void setSSN(String newValue) {
        ssn = newValue;
    }
}
