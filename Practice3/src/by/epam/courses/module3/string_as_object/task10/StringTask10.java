package by.epam.courses.module3.string_as_object.task10;

public class StringTask10 {
    public int countSentences(String str){
        int sentences = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?'){
                sentences += 1;
            }
        }
        return sentences;
    }
}
