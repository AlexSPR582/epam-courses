package by.epam.courses.modele1.line_program.task2;

import static java.lang.Math.*;

public class LineProgram2 {
    public double calculate(int a, int b, int c){
        return ((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a)) - pow(a, 3) * c + pow(b, -2);
    }
}
