package by.epam.courses.module3.string_as_object.task3;

public class StringTask3 {
    public boolean isPalindrome(String str){
        if (str.equals(reverse(str))){
            return true;
        }
        return false;
    }

    private String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        int ind = str.length() - 1;
        while (ind >= 0) {
            sb.append(str.charAt(ind));
            ind -= 1;
        }
        return sb.toString();
    }
}
