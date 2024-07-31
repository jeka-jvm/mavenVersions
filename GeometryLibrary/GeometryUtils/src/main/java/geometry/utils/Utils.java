package geometry.utils;

public class Utils {
    public static double convertToCentimeters(double meters) {
        return meters * 100;
    }

    public static boolean areEqual(double a, double b, double epsilon) {
        return Math.abs(a - b) < epsilon;
    }

    public void show() {
        System.out.println("Hello World");
    }
}
