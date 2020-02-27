public class Main {
    public static void main(String[] args) {
        Test2 obj1 = new Test2();
        Test2 obj2 = new Test2(40, 170);
        System.out.println(obj1.getA() + " " + obj1.getB());
        System.out.println(obj2.getA() + " " + obj2.getB());
        obj1.setA(17);
        obj1.setB(91);
        System.out.println(obj1.getA() + " " + obj1.getB());

    }
}
