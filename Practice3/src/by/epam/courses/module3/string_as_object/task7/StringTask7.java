package by.epam.courses.module3.string_as_object.task7;

public class StringTask7 {
    public String deleteRepeatingLettersAndSpaces(String str){
        StringBuilder sb = removeSpaces(str);
        int ind = 0;
        while (ind < sb.length() - 1) {
            if (sb.charAt(ind) == sb.charAt(ind + 1)) {
                sb.deleteCharAt(ind);
            } else {
                ind++;
            }
        }
        return sb.toString();
    }

    private StringBuilder removeSpaces(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                sb.append(string.charAt(i));
            }
        }
        return sb;
    }
}
