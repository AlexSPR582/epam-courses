package by.epam.courses.modele1.branching.task5;

import static java.lang.Math.*;

public class BranchingTask5 {
    public double findFunctionValue(int x){
        if (x > 3){
            return 1 / (pow(x, 3) + 6);

        }
        else {
            return pow(x, 2) - 3 * x + 9;
        }
    }
}
