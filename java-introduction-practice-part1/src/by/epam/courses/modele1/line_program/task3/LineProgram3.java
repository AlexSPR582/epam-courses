package by.epam.courses.modele1.line_program.task3;

import static java.lang.Math.*;

public class LineProgram3 {
    public double calculate(int x, int y){
        return ((sin(x) + cos(y))/(cos(x) - sin(y))) * tan(x * y);
    }
}
