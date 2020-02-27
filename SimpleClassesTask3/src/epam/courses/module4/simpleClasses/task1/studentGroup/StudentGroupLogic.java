package epam.courses.module4.simpleClasses.task1.studentGroup;

import epam.courses.module4.simpleClasses.task1.student.Student;
import epam.courses.module4.simpleClasses.task1.student.StudentLogic;

public class StudentGroupLogic {
    public void printExcellentStudents(StudentGroup students) {
        StudentLogic sl = new StudentLogic();
        for (Student student: students.getStudents()) {
            if (sl.isStudentExcellent(student)) {
                System.out.println(student.getName() + ", " + student.getGroup());
            }
        }
    }
}
