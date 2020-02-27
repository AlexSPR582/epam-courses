package by.epam.courses.module3.string_like_array_of_characters.task4;

public class CharSequenceTask4 {
    public int countNumbers(String str){
        char[] charSequence = str.toCharArray();
        boolean isNumber = false;
        int numberOfNumbers = 0;
        for (char element: charSequence){
            if ((int) element >= 48 && (int) element <= 57 && !isNumber){
                numberOfNumbers += 1;
                isNumber = true;
            }
            else if ((int) element < 48 || (int) element > 57){
                isNumber = false;
            }
        }
        return numberOfNumbers;
    }
}
