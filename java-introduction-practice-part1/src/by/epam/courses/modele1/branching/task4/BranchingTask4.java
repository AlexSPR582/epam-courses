package by.epam.courses.modele1.branching.task4;

public class BranchingTask4 {
    public boolean isBrickGoThoughtHole(int a, int b, Brick brick){
        int x = brick.getLength();
        int y = brick.getHeight();
        int z = brick.getWidth();
        if ((z <= a & y <= b) | (y <= a & z <= b)){
            return true;
        }
        else if ((z <= a & x <= b) | (z <= a & x <= b)) {
            return true;
        }
        else if ((y <= a & x <= b) | (x <= a & y <= b)) {
            return true;
        }
        return false;
    }
}
