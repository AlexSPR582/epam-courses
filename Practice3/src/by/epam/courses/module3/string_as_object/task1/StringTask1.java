package by.epam.courses.module3.string_as_object.task1;

public class StringTask1 {
    public int findMaxSpace(String str){
        str += ".";
        int maxAmountSpaces = 0;
        int currentAmountSpaces = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                currentAmountSpaces += 1;
            }
            else if (currentAmountSpaces > maxAmountSpaces) {
                maxAmountSpaces = currentAmountSpaces;
                currentAmountSpaces = 0;
            }
        }
        return maxAmountSpaces;
    }
}
