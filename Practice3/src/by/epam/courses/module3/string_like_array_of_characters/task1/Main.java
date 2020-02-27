package by.epam.courses.module3.string_like_array_of_characters.task1;

// 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CharSequenceTask1 task1 = new CharSequenceTask1();
        String[] variables = {"firstVariable", "secondVariable"};
        task1.changeArrayCamelCaseToSnakeCase(variables);
        System.out.println(Arrays.toString(variables));
    }
}
