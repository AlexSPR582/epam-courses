public class Test1 {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void printA() {
        System.out.println(this.a);
    }

    public void printB() {
        System.out.println(this.b);
    }

    public int sum() {
        return this.a + this.b;
    }

    public int findBigger() {
        if (this.a > this.b) {
            return this.a;
        } else {
            return this.b;
        }
    }
}


