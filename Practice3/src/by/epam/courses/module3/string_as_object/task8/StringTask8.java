package by.epam.courses.module3.string_as_object.task8;

public class StringTask8 {
    public String findLongestWord(String str){
        String[] words = str.split(" ");
        String longestWord = "";
        for (String word: words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;



       /* StringBuilder longestWord = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ' || i == str.length() - 1){
                if (word.length() > longestWord.length()){
                    longestWord = word;
                    word = new StringBuilder("");
                }
            }
            else {
                word.append(str.charAt(i));
            }
        }
        return longestWord.toString();*/
    }



}
