package by.epam.courses.module3.string_like_array_of_characters.task2;

public class CharSequenceTask2 {


    public String replacementWordToLetter(String str){
        char[] charSequence = str.toLowerCase().toCharArray();
        String word = "word";
        String result = "";
        int wordInd = 0;
        int ind = 0;
        while(ind < charSequence.length){
            if (wordInd == 3 && charSequence[ind] == word.charAt(wordInd)) {
                result = insertLetter(result, result.length() - 3);
                wordInd = 0;
            }
            else if (charSequence[ind] == word.charAt(wordInd)){
                wordInd += 1;
                result += String.valueOf(charSequence[ind]);
            }
            else {
                wordInd = 0;
                result += String.valueOf(charSequence[ind]);
            }
            ind += 1;
        }
        return result;
    }

    private String insertLetter(String str, int index) {
        String beforeInd = str.substring(0, index);
        return beforeInd + "letter";
    }
}
