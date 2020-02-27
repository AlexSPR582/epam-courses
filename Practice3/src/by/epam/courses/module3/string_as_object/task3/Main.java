package by.epam.courses.module3.string_as_object.task3;

//3. Проверить, является ли заданное слово палиндромом.

public class Main {
    public static void main(String[] args) {
        StringTask3 task3 = new StringTask3();
        String str1 = "hello";
        String str2 = "доход";
        System.out.println(task3.isPalindrome(str1));
        System.out.println(task3.isPalindrome(str2));
    }
}
