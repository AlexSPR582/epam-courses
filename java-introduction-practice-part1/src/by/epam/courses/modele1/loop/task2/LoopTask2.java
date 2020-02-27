package by.epam.courses.modele1.loop.task2;

public class LoopTask2 {
    public void findFunctionValueOnLine(int a, int b, int h){
        int x = a;
        while (x <= b){
            if (x > 2){
                System.out.print(x + " ");
            }
            else {
                System.out.print(-x + " ");
            }
            x += h;
        }
    }
}
