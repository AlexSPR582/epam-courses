package by.epam.courses.module3.string_as_object.task4;

public class StringTask4 {
    public String createCake(){
        String informatics = "информатика";
        return informatics.substring(7, 8)
                + informatics.substring(3, 5)
                + informatics.substring(7, 8);
    }
}
