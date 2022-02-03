package com.assignments.assignment7.Task5;

public class Outer2 extends Outer1{

    static class Inner2 extends Outer1.Inner1
    {
        Inner2()
        {
            super("Hii");
        }
    }

    public static void main(String[] args) {
        Outer2.Inner2 inner2=new Outer2.Inner2();
    }
}
