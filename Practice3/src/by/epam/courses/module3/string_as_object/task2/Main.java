package by.epam.courses.module3.string_as_object.task2;

//2. В строке вставить после каждого символа 'a' символ 'b'.

public class Main {
    public static void main(String[] args) {
        StringTask2 task2 = new StringTask2();
        String str = "adfr a";
        System.out.println(task2.insertB(str));
    }
}
