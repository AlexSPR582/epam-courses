package by.epam.courses.module3.string_as_object.task5;

public class StringTask5 {
    public int countA(String str){
        int repeatA = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a'){
                repeatA += 1;
            }
        }
        return repeatA;

    }
}
