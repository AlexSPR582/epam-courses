package by.epam.courses.module3.string_as_object.task7;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde
// def", то должно быть выведено "abcdef".

public class Main {
    public static void main(String[] args) {
        StringTask7 task7 = new StringTask7();
        String str = "fff   fghj tt    ";
        System.out.println(task7.deleteRepeatingLettersAndSpaces(str));
    }
}
