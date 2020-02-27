package by.epam.courses.module3.string_as_object.task9;

public class StringTask9 {
    public int countLittleLetters(String str){
        int littleLetters = 0;
        for (int i = 0; i < str.length(); i++){
            if ((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122){
                littleLetters += 1;
            }
        }
        return littleLetters;
    }

    public int countBigLetters(String str){
        int bigLetters = 0;
        for (int i = 0; i < str.length(); i++){
            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90){
                bigLetters += 1;
            }
        }
        return bigLetters;
    }
}
