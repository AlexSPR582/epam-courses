package epam.courses.module4.simpleClasses.task1.studentGroup;

import epam.courses.module4.simpleClasses.task1.student.Student;

public class StudentGroup {
    private Student[] students;

    public StudentGroup(Student... students){
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
