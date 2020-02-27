package by.epam.courses.module3.string_as_object.task6;

//6. Из заданной строки получить новую, повторив каждый символ дважды.

public class Main {
    public static void main(String[] args) {
        StringTask6 task6 = new StringTask6();
        String str = "abcd";
        System.out.println(task6.duplicateLetters(str));
    }
}
