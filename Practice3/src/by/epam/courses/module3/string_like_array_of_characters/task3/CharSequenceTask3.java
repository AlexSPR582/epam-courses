package by.epam.courses.module3.string_like_array_of_characters.task3;

public class CharSequenceTask3 {
    public int countNumbers(String str){
        char[] charSequence = str.toCharArray();
        int numberOfNumbers = 0;
        for (char element: charSequence){
            if ((int) element >= 48 && (int) element <= 57){
                numberOfNumbers += 1;
            }
        }
        return numberOfNumbers;
    }
}
