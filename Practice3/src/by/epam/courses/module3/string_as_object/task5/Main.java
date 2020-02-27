package by.epam.courses.module3.string_as_object.task5;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Main {
    public static void main(String[] args) {
        StringTask5 task5 = new StringTask5();
        String str = "aerta gcxatya";
        System.out.println(task5.countA(str));
    }
}
