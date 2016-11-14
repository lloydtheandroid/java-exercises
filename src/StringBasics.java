/**
 * Created by lloyd on 11/14/16.
 */
public class StringBasics {
    public static void main(String[] args) {

        StringBuffer message = new StringBuffer("We don't need no education ");

        message.append("\n We don't need no self control");

        message.append("\nCheck \"this\" out!, \"s inside of \"s!");

        message.append("\n In windows, the main drive is usually C:\\");


        message.append("\n I can do back slashes \\, and double back slashes \\\\, and the amazing triple back-slash \\\\\\!");
        System.out.println(message);



    }
}
