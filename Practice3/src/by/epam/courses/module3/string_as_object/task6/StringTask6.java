package by.epam.courses.module3.string_as_object.task6;

public class StringTask6 {
    public String duplicateLetters(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
