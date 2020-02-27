package by.epam.courses.module3.string_as_object.task1;

//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Main {
    public static void main(String[] args) {
        StringTask1 task1 = new StringTask1();
        String str = "hello world  ";
        System.out.println(task1.findMaxSpace(str));
    }
}
