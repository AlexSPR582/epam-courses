package by.epam.courses.modele1.branching.task3;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        Point point3 = new Point(3, 3);

        BranchingTask3 task3 = new BranchingTask3();
        System.out.println(task3.isPointsOnSameLine(point1, point2, point3));

        Point point4 = new Point(-1, -3);
        System.out.println(task3.isPointsOnSameLine(point1, point4, point3));
    }
}
