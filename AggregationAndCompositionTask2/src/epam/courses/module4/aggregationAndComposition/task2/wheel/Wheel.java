package epam.courses.module4.aggregationAndComposition.task2.wheel;

public class Wheel {
    private int diameter;
    private int width;

    public Wheel(int diameter, int width) {
        this.diameter = diameter;
        this.width = width;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getWidth() {
        return width;
    }
}
