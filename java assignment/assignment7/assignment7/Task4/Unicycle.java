package com.assignments.assignment7.Task4;

public class Unicycle implements Cycle{

    private Unicycle() {
        System.out.println("Unicycle");
    }
    public void ride() {
        System.out.println("Ride Unicycle");
    }
    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle()
        {
            return new Unicycle();
        }
    };
}
