/**
 * Created by lloyd on 11/14/16.
 */
public class BasicArithmetic {

    public static int AddNumber(int x , int y){
        return x + y;
    }
    public static int SubtractNumber(int x , int y){
        return x - y;
    }
    public static int MultiplyNumber(int x , int y){
        return x * y;
    }
    public static int DivideNumber(int x , int y){
        return x / y;
    }
    public static int RemainderOfNumber(int x , int y){
        return x % y;
    }
    public static void main(String[] args) {
        int x = 50;
        int y = 4;

        System.out.println(x + " plus " + y + " is: " + AddNumber(x,y));
        System.out.println(x + " minus " + y + " is: " + SubtractNumber(x,y));
        System.out.println(x + " times " + y + " is: " + MultiplyNumber(x,y));
        System.out.println(x + " divided by " + y + " is: " + DivideNumber(x,y));
        System.out.println("The remainder of " + x + " divided by " + y + " is: " + RemainderOfNumber(x,y));

//          What happens when we divide by Zero
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at BasicArithmetic.DivideNumber(BasicArithmetic.java:16)
//        at BasicArithmetic.main(BasicArithmetic.java:28)
//        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.lang.reflect.Method.invoke(Method.java:498)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
    }
}
