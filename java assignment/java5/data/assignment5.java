package shivam.assignment.data;

public class assignment5 {
    int var;
    char mem;

    public void simple() {
        System.out.print(var);
        System.out.print(mem);
    }
//    public void temp()
//    {
//        int a,b;
//        System.out.print(a);// these are the local variables, so we have to initialize them
//        System.out.print(b);
//    }


    public static void main(String[] args)
    {
        assignment5 obj=new assignment5();
        obj.simple();
    }
}
