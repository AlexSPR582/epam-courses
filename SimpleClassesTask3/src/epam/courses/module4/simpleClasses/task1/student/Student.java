package epam.courses.module4.simpleClasses.task1.student;

import epam.courses.module4.simpleClasses.task1.incorrectMarkException.IncorrectMarkException;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int[] marks;

    public Student(String name, String group, int... marks){
        this.name = name;
        this.group = group;
        if (validMarks(marks)){
            this.marks = Arrays.copyOf(marks, 5);
        }
        else {
            throw new IncorrectMarkException("Вы ввели некорректные данные");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int... marks) {
        this.marks = Arrays.copyOf(marks, 5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group &&
                Objects.equals(name, student.name) &&
                Arrays.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, group);
        result = 31 * result + Arrays.hashCode(marks);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    private boolean validMarks(int[] marks) {
        for (int mark: marks) {
            if (mark < 0 || mark > 10) {
                return false;
            }
        }
        return true;
    }
}
