package by.epam.courses.modele1.line_program.task5;

public class LineProgram5 {
    public void printTime(int seconds){
        int hours = seconds / 3600;
        seconds -= hours * 3600;
        int minutes = seconds / 60;
        seconds -= minutes * 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "c");
    }
}
