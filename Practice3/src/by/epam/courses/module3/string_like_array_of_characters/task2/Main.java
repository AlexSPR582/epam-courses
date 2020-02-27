package by.epam.courses.module3.string_like_array_of_characters.task2;

//2. Замените в строке все вхождения 'word' на 'letter'.

public class Main {
    public static void main(String[] args) {
        String str = "first Word second word";
        CharSequenceTask2 task2 = new CharSequenceTask2();
        System.out.println(task2.replacementWordToLetter(str));
    }
}
