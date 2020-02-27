package by.epam.courses.module3.string_like_array_of_characters.task5;

//5.  Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих
// пробелов  заменить  на  одиночные  пробелы.
// Крайние пробелы в строке удалить.

public class Main {
    public static void main(String[] args) {
        CharSequenceTask5 task5 = new CharSequenceTask5();
        String str = "   hello   world  ";
        System.out.println(task5.removeExtraSpaces(str));
    }
}
