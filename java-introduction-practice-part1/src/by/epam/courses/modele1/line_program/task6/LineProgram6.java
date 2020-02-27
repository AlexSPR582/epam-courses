package by.epam.courses.modele1.line_program.task6;

public class LineProgram6 {
    public void isPointBelongsArea(int x, int y){
        if (y > 0 && y <= 4) {
            if (x >= -2 && x <= 2){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
        else if (x == 0 & y == -1){
            System.out.println(false);
        }
        else if (y <= 0 & y >= -3) {
            if (x >= -4 & x <= 4){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
    }
}

