package epam.courses.module4.simpleClasses.task7.triangle;

import epam.courses.module4.simpleClasses.task7.point.Point;

import static java.lang.Math.*;

public class TriangleLogic {
    private static TriangleLogic triangleLogic;

    private TriangleLogic() {}

    public static TriangleLogic getInstance() {
        if (triangleLogic == null) {
            triangleLogic = new TriangleLogic();
        }
        return triangleLogic;
    }

    public double calculatePerimeter(Triangle triangle){
        return triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
    }

    public double calculateAreaOfTriangle(Triangle triangle){
        double halfPerimeter = calculatePerimeter(triangle) / 2;
        return sqrt(halfPerimeter * (halfPerimeter - triangle.getSide1())
                * (halfPerimeter - triangle.getSide2()) * (halfPerimeter - triangle.getSide3()));
    }

    public Point intersectionOfMedians(Triangle triangle){
        double x = (triangle.getPoint1().getX() +
                triangle.getPoint2().getX() +
                triangle.getPoint3().getX()) / 3;
        double y = (triangle.getPoint1().getY() +
                triangle.getPoint2().getY() +
                triangle.getPoint3().getY()) / 3;
        return new Point(x, y);
    }
}
