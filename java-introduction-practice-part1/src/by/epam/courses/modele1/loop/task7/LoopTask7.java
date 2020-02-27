package by.epam.courses.modele1.loop.task7;

public class LoopTask7 {
    public void printAllDenominators(int m, int n){
        for (int i = m; i <= n; i++){
            System.out.print(i + ": ");
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
