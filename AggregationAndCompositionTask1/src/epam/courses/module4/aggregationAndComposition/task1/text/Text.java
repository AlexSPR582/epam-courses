package epam.courses.module4.aggregationAndComposition.task1.text;

import epam.courses.module4.aggregationAndComposition.task1.sentence.Sentence;

import java.util.List;

public class Text {
    private List<Sentence> text;
    private String title;


    public Text(String title, List<Sentence> sentences){
        this.sentences = sentences;
        this.title = title;
    }

    public void addText(Sentence sentence){
        sentences.add(sentence);
    }

    public void addText(List<Sentence> sentences){
        this.sentences.addAll(sentences);
    }

    public void printText(){
        for (Sentence sentence: sentences){
            System.out.print(sentence.getSentence() + " ");
        }
    }

    public void printTitle() {
        System.out.println(this.title.getWord());;
    }
}
