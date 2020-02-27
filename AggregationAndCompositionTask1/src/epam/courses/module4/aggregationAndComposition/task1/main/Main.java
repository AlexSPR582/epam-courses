package epam.courses.module4.aggregationAndComposition.task1.main;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 вывести на консоль текст, заголовок текста.*/


import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Word title = new Word("Лес");
        Sentence sentence1 = new Sentence("Человек гулял по лесу.");
        Sentence sentence2 = new Sentence("На деревьях пели птицы.");
        Sentence sentence3 = new Sentence("Где-то далеко был слышен шум реки.");
        List<Sentence> sentences = new ArrayList<>();
        sentences.add(sentence1);
        sentences.add(sentence2);
        sentences.add(sentence3);
        Text text = new Text(title, sentences);
        text.addText(new Sentence("Вдруг рядом с ним упала шишка."));
        text.printText();


    }
}
