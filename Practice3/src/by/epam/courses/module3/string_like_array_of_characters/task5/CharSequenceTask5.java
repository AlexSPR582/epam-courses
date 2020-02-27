package by.epam.courses.module3.string_like_array_of_characters.task5;

public class CharSequenceTask5 {
    public String removeExtraSpaces(String str){
        char[] charSequence = str.toCharArray();
        String result = "";
        int numberOfSpaces = 0;
        for (char element: charSequence){
            if (element != ' '){
                result += element;
                numberOfSpaces = 0;
            }
            else if (element == ' ' && numberOfSpaces == 0){
                numberOfSpaces += 1;
                result += element;
            }
        }
        return result.trim();
    }
}
