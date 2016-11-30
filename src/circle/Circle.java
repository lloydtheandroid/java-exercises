package circle;

/**
 * Created by lloyd on 11/30/16.
 */

public class Circle {

    private double radius;
    double circumference;

    public Circle(double radius) {this.radius = radius;}

    static double getCircumference(double radius ) {
        return Math.PI * 2 * radius;
    }
    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }
//
//
//    public String getFormattedCircumference()
//    public String getFormattedArea()
//    private String formatNumber(double x)
//    public static int getObjectCount()
}
