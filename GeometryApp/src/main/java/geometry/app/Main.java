package geometry.app;

import geometry.utils.Utils;
import org.example.geometry.library.Circle;
import org.example.geometry.library.Rectangle;
import org.example.geometry.library.Triangle;
import org.example.geometry.threedimensional.Cube;
import org.example.geometry.threedimensional.Sphere;


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Радиус круга в см: " + Utils.convertToCentimeters(circle.getArea()));

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());

        Cube cube = new Cube(3);
        System.out.println("Объем куба: " + cube.getVolume());
        System.out.println("Площадь поверхности куба: " + cube.getSurfaceArea());

        Sphere sphere = new Sphere(4);
        System.out.println("Объем сферы: " + sphere.getVolume());
        System.out.println("Площадь поверхности сферы: " + sphere.getSurfaceArea());
    }
}
