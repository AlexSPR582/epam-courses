package by.epam.courses.module3.string_as_object.task8;

//8. Вводится строка слов, разделенных пробелами.
// Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Main {
    public static void main(String[] args) {
        StringTask8 task8 = new StringTask8();
        String str = "fghkdfj duyy dhfj";
        System.out.println(task8.findLongestWord(str));
    }
}
