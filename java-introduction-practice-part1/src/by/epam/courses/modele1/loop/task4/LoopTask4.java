package by.epam.courses.modele1.loop.task4;

import java.math.BigInteger;

public class LoopTask4 {
    public BigInteger multiplySquares(){
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++){
            result = result.multiply(BigInteger.valueOf(i * i));
        }
        return result;
    }
}
