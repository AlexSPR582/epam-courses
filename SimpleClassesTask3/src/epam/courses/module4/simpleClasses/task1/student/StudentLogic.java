package epam.courses.module4.simpleClasses.task1.student;

public class StudentLogic {
    public boolean isStudentExcellent(Student student) {
        for (int mark: student.getMarks()) {
            if (mark < 9) {
                return false;
            }
        }
        return true;
    }
}
