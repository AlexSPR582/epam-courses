package by.epam.courses.modele1.loop.task8;

public class LoopTask8 {
    public void getResult(int firstNum, int secondNum){
        while (firstNum >= 0) {
            if (contain(firstNum % 10, secondNum)) {
                System.out.print(firstNum % 10 + " ");
                firstNum = firstNum / 10;
            }
        }
        System.out.println();
    }


    private boolean contain(int numeral, int number) {
        while (number >= 0) {
            if (number % 10 == numeral) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
