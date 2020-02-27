package by.epam.courses.modele1.line_program.task4;

import static java.lang.Math.*;

public class LineProgram4 {
    public double swap(double number){
        double intPart = (int) number;
        double doublePart = round((number - intPart) * 1000);
        return doublePart + intPart / 1000.0;
    }
}
