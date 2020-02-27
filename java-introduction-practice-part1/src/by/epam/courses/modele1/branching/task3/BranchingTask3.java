package by.epam.courses.modele1.branching.task3;


public class BranchingTask3 {
    public boolean isPointsOnSameLine(Point point1, Point point2, Point point3){
        double x1 = point1.getX();
        double x2 = point2.getX();
        double x3 = point3.getX();

        double y1 = point1.getY();
        double y2 = point2.getY();
        double y3 = point3.getY();

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            return true;
        }
        return false;
    }
}
