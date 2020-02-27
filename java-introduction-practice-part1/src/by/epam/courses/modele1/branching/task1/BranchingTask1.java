package by.epam.courses.modele1.branching.task1;

public class BranchingTask1 {
    public boolean isRightTriangle(int angle1, int angle2) {
        if (isTriangleExist(angle1, angle2)) {
            if (angle1 == 90 || angle2 == 90 || 180 - angle1 - angle2 == 90) {
                return true;
            }
        }
        return false;
    }

    public boolean isTriangleExist(int angle1, int angle2){
        if (angle1 + angle2 < 180) {
            return true;
        }
        return false;
    }
}
