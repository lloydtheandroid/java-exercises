/**
 * Created by lloyd on 11/11/16.
 */
public class HelloWorld {
    /**
     * This is a document block
     * @param args
     */
    public static void main(String[] args) {
        // same as JS window.console.log()
        //sout shortcut

        byte ipAdd = 1;
        short s = 12345;
        int dayNumber = 5;
        long l = 12L;
        float f = 13.20f;
        double dub = 1234.4321d;
        String greetings = ("Hello there");
        boolean areYouOk = false;

        System.out.println("The byte ipAdd is: " + ipAdd);
        System.out.println("The short s is: " + s);
        System.out.println("The int dayNumber is: " + dayNumber);
        System.out.println("The long l is: " + l);
        System.out.println("The float f is: " + f);
        System.out.println("The double dub is: " + dub);
        System.out.println("The string greetings is: " + greetings);
        System.out.println("The boolean areYouOk is: " + areYouOk);

        double newDub;
        newDub = f + dub;

        System.out.println("f + dub = " + newDub);
        String name = "Tim";

        System.out.println(greetings + " " + name);
        String joe = "yolo";
        System.out.println(joe);

    }
}
