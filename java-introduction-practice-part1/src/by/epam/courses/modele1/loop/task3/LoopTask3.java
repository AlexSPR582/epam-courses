package by.epam.courses.modele1.loop.task3;

import static java.lang.Math.*;

public class LoopTask3 {
    public int sumSquaredNumber(){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += pow(i, 2);
        }
        return sum;
    }
}
