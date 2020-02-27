package epam.courses.module4.simpleClasses.task7.point;

import static java.lang.Math.*;

public class PointLogic {
    private static PointLogic pointLogic;

    private PointLogic() {}

    public static PointLogic getInstance() {
        if (pointLogic == null) {
            pointLogic = new PointLogic();
        }
        return pointLogic;
    }

    public double calculateDistance(Point point1, Point point2) {
        return sqrt(pow(point2.getX() - point1.getX(), 2) +
                pow(point2.getY() - point1.getY(), 2));
    }

    public void printPoint(Point point) {
        System.out.println("x = " + point.getX() + " y = " + point.getY());
    }
}
