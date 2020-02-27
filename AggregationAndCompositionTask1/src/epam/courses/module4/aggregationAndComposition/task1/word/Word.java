package epam.courses.module4.aggregationAndComposition.task1.word;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Word {
    private String word;

    public Word(String word){
        if (validation(word)){
            this.word = word;
        }
        else {
            throw new WordException("Переданная строка не является словом");
        }
    }

    public void setWord(String word) {
        if (validation(word)){
            this.word = word;
        }
        else {
            throw new WordException("Переданная строка не является словом");
        }
    }

    public String getWord() {
        return word;
    }

    private boolean validation(String word) {
        Pattern pattern = Pattern.compile("^\\w+-?\\w+$");
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }
}
