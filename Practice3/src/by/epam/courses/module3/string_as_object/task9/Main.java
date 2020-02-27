package by.epam.courses.module3.string_as_object.task9;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
//   Учитывать только английские буквы.

public class Main {
    public static void main(String[] args) {
        StringTask9 task9 = new StringTask9();
        String str = "Gfdju DJnd juD";
        System.out.println(task9.countBigLetters(str));
        System.out.println(task9.countLittleLetters(str));
    }
}
