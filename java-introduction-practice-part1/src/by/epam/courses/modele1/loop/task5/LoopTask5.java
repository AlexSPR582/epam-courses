package by.epam.courses.modele1.loop.task5;

import static java.lang.Math.*;

public class LoopTask5 {
    public double sum(double e){
        double sum = 0;
        int n = 1;
        while(count(n) >= e){
            sum += count(n);
            n++;

        }
        return sum;
    }

    private double count(int n) {
        return 1 / pow(2, n) + 1 / pow(3, n);
    }
}
