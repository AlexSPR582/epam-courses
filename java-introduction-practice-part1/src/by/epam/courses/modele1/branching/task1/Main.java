package by.epam.courses.modele1.branching.task1;

public class Main {
    public static void main(String[] args) {
        BranchingTask1 task1 = new BranchingTask1();
        System.out.println("Является ли треугольник прямогольным если он существует");
        System.out.println(task1.isRightTriangle(90, 45));
        System.out.println(task1.isRightTriangle(45, 45));
        System.out.println(task1.isRightTriangle(50, 30));
        System.out.println(task1.isRightTriangle(90, 90));
    }
}
