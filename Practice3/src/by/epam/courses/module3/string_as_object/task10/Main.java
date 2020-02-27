package by.epam.courses.module3.string_as_object.task10;

//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком.
// Определить количество предложений в строке X.

public class Main {
    public static void main(String[] args) {
        StringTask10 task10 = new StringTask10();
        String str = "hello! How are You? I'm fine, thanks.";
        System.out.println(task10.countSentences(str));
    }
}
