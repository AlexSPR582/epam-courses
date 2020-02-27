package by.epam.courses.module3.regular_expression.task1;

import java.text.Collator;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsTask1 {
    public void getResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");



        String str = "\tHe1ll1o, de111ar's b1i1lly.\n" +
                "H1ow are y11ou?\n" +
                "\tTh11anks, 1i'm fin1e.\n";
        System.out.println("\nнажмите 1 чтобы отсортировать абзацы по количеству предложений");
        System.out.println("нажмите 2 чтобы отсортировать слова в каждом предложении по длине");
        System.out.println("нажмите 3 чтобы отсортировать лексемы в предложении по убыванию количества вхождения заданного символа");

        //String[] paragraphs = findParagraphs(str);
        //sortParagraphs(paragraphs);
        //System.out.println(arrayToString(paragraphs));


        /*String[] sentences = findSentences(str);
        for (int i = 0; i < sentences.length; i++){
            String[] words = findWords(sentences[i]);
            sortWordLength(words);
            sentences[i] = wordsIntoSentence(sentences[i], words);
        }
        System.out.println(sentenceIntoParagraph(str, sentences));*/

        String[] sentences = findSentences(str);
        for (int i = 0; i < sentences.length; i++){
            String[] words = findWords(sentences[i]);
            sortWordsCharacterOccurrence(words, '1');
            sentences[i] = wordsIntoSentence(sentences[i], words);
        }
        System.out.println(sentenceIntoParagraph(str, sentences));





    }

    private String[] findParagraphs(String str){
        Pattern pattern = Pattern.compile("[\t][^\t]+");
        Matcher matcher = pattern.matcher(str);
        List<String> paragraphsList = new ArrayList<>();
        while (matcher.find()){
            paragraphsList.add(matcher.group());
        }
        String[] paragraphs = new String[paragraphsList.size()];
        paragraphsList.toArray(paragraphs);
        return paragraphs;
    }

    private String[] findSentences(String str){
        Pattern pattern = Pattern.compile("[А-ЯA-Z0-9'][^.!?]+[.!?]");
        Matcher matcher = pattern.matcher(str);
        List<String> sentencesList = new ArrayList<>();
        while (matcher.find()){
            sentencesList.add(matcher.group());
        }
        String[] sentences = new String[sentencesList.size()];
        sentencesList.toArray(sentences);
        return sentences;
    }

    private String[] findWords(String str){
        Pattern pattern = Pattern.compile("[a-zA-Z0-9']+");
        Matcher matcher = pattern.matcher(str);
        List<String> wordsList = new ArrayList<>();
        while (matcher.find()){
            wordsList.add(matcher.group());
        }
        String[] words = new String[wordsList.size()];
        wordsList.toArray(words);
        return words;
    }

    private int countSentences(String str){
        int sentences = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?'){
                sentences += 1;
            }
        }
        return sentences;
    }

    private String[] sortParagraphs(String[] paragraphs){
        for (int i = 1; i < paragraphs.length; i++){
            int j = i - 1;
            String value = paragraphs[i];
            while (j >= 0 && countSentences(paragraphs[j]) > countSentences(value)){
                paragraphs[j + 1] = paragraphs[j];
                j = j - 1;
            }
            paragraphs[j + 1] = value;
        }
        return paragraphs;
    }

    private String[] sortWordLength(String[] words){
        for (int i = 1; i < words.length; i++){
            int j = i - 1;
            String value = words[i];
            while (j >= 0 && words[j].length() > value.length()){
                words[j + 1] = words[j];
                j = j - 1;
            }
            words[j + 1] = value;
        }
        return words;
    }

    private String[] sortWordsCharacterOccurrence(String[] words, char symbol){
        for (int i = 1; i < words.length; i++){
            int j = i - 1;
            String value = words[i];
            while (j >= 0 && countCharacterOccurrence(words[j + 1], symbol) <= countCharacterOccurrence(value, symbol)){
                if (countCharacterOccurrence(words[j + 1], symbol) == countCharacterOccurrence(words[j], symbol)){


                    //String[] sameOccurrence = {words[j], words[j + 1]};
                    Collator collator = Collator.getInstance(new Locale("en"));
                    List<String> sameOccurrence = new ArrayList<>();
                    sameOccurrence.add(words[j]);
                    sameOccurrence.add(words[j + 1]);
                    Collections.sort(sameOccurrence, collator);
                    words[j] = sameOccurrence.get(0);
                    words[j + 1] = sameOccurrence.get(1);
                    continue;
                }
                else {
                    words[j + 1] = words[j];
                }
                j = j - 1;
            }
            words[j + 1] = value;
        }
        return words;
    }

    private int countCharacterOccurrence(String str, char symbol){
        int characterOccurrence = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == symbol){
                characterOccurrence += 1;
            }
        }
        return characterOccurrence;
    }

    private String wordsIntoSentence(String sentence, String[] sortWords){
        StringBuilder sb = new StringBuilder(sentence);
        String[] words = findWords(sentence);
        int index = 0;
        for (int i = 0; i < words.length; i++){
            if (index < sb.length()){
                int wordInd = sb.indexOf(words[i], index);
                sb.delete(wordInd, wordInd + words[i].length());
                sb.insert(wordInd, sortWords[i]);
                index += sortWords[i].length() + 1;
            }
        }
        return sb.toString();
    }

    private String sentenceIntoParagraph(String paragraphs, String[] sortSentences){
        StringBuilder sb = new StringBuilder(paragraphs);
        String[] sentences = findSentences(paragraphs);
        int index = 0;
        for (int i = 0; i < sentences.length; i++){
            if (index < sb.length()){
                int wordInd = sb.indexOf(sentences[i], index);
                sb.delete(wordInd, wordInd + sentences[i].length());
                sb.insert(wordInd, sortSentences[i]);
                index += sortSentences[i].length() + 1;
            }
        }
        return sb.toString();
    }
}
