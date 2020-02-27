package epam.courses.module4.aggregationAndComposition.task1.sentence;

import java.util.regex.Pattern;

public class Sentence {
    private String sentence;

    public Sentence(String sentence){
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    private boolean validation(String sentence) {
        Pattern pattern = Pattern.compile("^[.!?]$")
    }
}
