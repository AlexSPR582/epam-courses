package by.epam.courses.module3.string_like_array_of_characters.task4;

//4. В строке найти количество чисел.

public class Main {
    public static void main(String[] args) {
        CharSequenceTask4 task4 = new CharSequenceTask4();
        String str = "345fgt1234kij es34 p03";
        System.out.println(task4.countNumbers(str));
    }
}
