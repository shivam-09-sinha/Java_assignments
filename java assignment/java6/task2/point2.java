package task2;

public class point2{

    point2() {
        System.out.println("constructor 1 is running. ");
    }
    point2(int str) {
        this();
        System.out.println(str);
    }
    public static void main(String[] args) {
        point2 obj = new point2(5);
    }
}