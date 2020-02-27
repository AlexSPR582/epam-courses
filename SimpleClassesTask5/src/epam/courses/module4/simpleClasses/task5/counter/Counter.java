package epam.courses.module4.simpleClasses.task5.counter;

public class Counter {
    private int value = 0;
    private int rightRange = 10;
    private int leftRange = -10;

    public Counter(){}

    public Counter(int value, int leftRange, int rightRange){
        this.value = value;
        this.leftRange = leftRange;
        this.rightRange = rightRange;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRightRange() {
        return rightRange;
    }

    public void setRightRange(int rightRange) {
        this.rightRange = rightRange;
    }

    public int getLeftRange() {
        return leftRange;
    }

    public void setLeftRange(int leftRange) {
        this.leftRange = leftRange;
    }

    public void increaseCounter(){
        if (value < rightRange){
            value += 1;
        }
    }

    public int getValue() {
        return value;
    }

    public void reduceCounter(){
        if (value > leftRange){
            value = value - 1;
        }
    }
}
