package by.epam.courses.modele1.branching.task2;

public class BranchingTask2 {
    public int findMax(int a, int b, int c, int d){
        if (min(a, b) > min(c, d)) {
            return min(a, b);
        }
        return min(c, d);
    }

    private int min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }
}
