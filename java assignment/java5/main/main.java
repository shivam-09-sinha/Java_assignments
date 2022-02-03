package shivam.assignment.main;
import shivam.assignment.data.assignment5;
import shivam.assignment.singleton.singleton;

public class main {

    public static void main(String[] args) {
        assignment5 obj2 =new assignment5();
        //global variables which can get default values.
        obj2.simple();
        //local variables which are not initialized but does not get any default values.
        obj2.temp();
        //static methods can only access static variables.
        singleton obj1 = new singleton("str");
        obj1.temp();

    }

}