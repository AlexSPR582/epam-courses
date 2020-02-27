package by.epam.courses.module3.string_like_array_of_characters.task1;

public class CharSequenceTask1 {
    public void changeArrayCamelCaseToSnakeCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = camelCaseToSnakeCase(array[i]);
        }
    }

    private String camelCaseToSnakeCase(String variableName){
        String snakeCase = "";
        char[] camelCase = variableName.toCharArray();
        for (char symbol: camelCase){
            if ((int) symbol >= 65 && (int) symbol <= 90){
                char lowCase = (char) ((int) symbol + 32);
                snakeCase += "_" + lowCase;
            }
            else {
                snakeCase += symbol;
            }
        }
        return snakeCase;
    }
}
