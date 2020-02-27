package simpleClasses;

import java.util.Scanner;

public class Student {
    private String surnameAndInitials;
    private int group;
    private int[] marks = new int[5];

    public Student(String name, int group, int[] marks){
        this.surnameAndInitials = name;
        this.group = group;
        for (int i = 0; i < 5; i++){
            this.marks[i] = marks[i];
        }
    }

    public static Student[] arrayOfStudent(){
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++){
            students[i] = createStudent();
        }
        return students;
    }

    private static Student createStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию и инициалы студента");
        String name = sc.nextLine();
        System.out.println("Введите группу студента");
        int group = sc.nextInt();
        System.out.println("Введите оценки студента (5 цифр)");
        int[] marks = new int[5];
        for (int j = 0; j < 5; j++){
            marks[j] = sc.nextInt();
        }
        return new Student(name, group, marks);
    }



    public static void printExcellentStudent(Student[] students){
        for (Student student: students){
            if (findExcellentStudent(student)){
                System.out.println(student.surnameAndInitials + " группа " + student.group);
            }
        }
    }

    private static boolean findExcellentStudent(Student student){
        for (int mark: student.marks){
            if (mark < 9){
                return false;
            }
        }
        return true;
    }
}
