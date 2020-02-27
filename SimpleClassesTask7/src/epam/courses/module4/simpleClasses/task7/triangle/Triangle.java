package epam.courses.module4.simpleClasses.task7.triangle;

import epam.courses.module4.simpleClasses.task7.point.Point;
import epam.courses.module4.simpleClasses.task7.point.PointLogic;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.side1 = PointLogic.getInstance().calculateDistance(point1, point2);
        this.side2 = PointLogic.getInstance().calculateDistance(point2, point3);
        this.side3 = PointLogic.getInstance().calculateDistance(point1, point3);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
}
