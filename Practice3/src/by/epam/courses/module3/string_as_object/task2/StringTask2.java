package by.epam.courses.module3.string_as_object.task2;

public class StringTask2 {
    public String insertB(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a'){
                sb.insert(i + 1, 'b');
            }
        }
        return sb.toString();
    }
}
