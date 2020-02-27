package epam.courses.module4.simpleClasses.task7.main;

import epam.courses.module4.simpleClasses.task7.point.Point;
import epam.courses.module4.simpleClasses.task7.point.PointLogic;
import epam.courses.module4.simpleClasses.task7.triangle.Triangle;
import epam.courses.module4.simpleClasses.task7.triangle.TriangleLogic;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2, 1);
        Point point2 = new Point(6, 1);
        Point point3 = new Point(4, 4);

        Triangle triangle = new Triangle(point1, point2, point3);
        TriangleLogic tl = TriangleLogic.getInstance();
        PointLogic pl = PointLogic.getInstance();

        System.out.println("периметр триугольника равен: " + tl.calculatePerimeter(triangle));
        System.out.println("площадь треугольника равна: " + tl.calculateAreaOfTriangle(triangle));
        System.out.print("точка пересечения медиан: ");
        pl.printPoint(tl.intersectionOfMedians(triangle));
    }
}
