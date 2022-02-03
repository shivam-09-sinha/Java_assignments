package com.assignments.assignment7.Task4;

public class Bicycle implements Cycle {

    private Bicycle() {
        System.out.println("Bicycle"); }
    @Override
    public void ride() {
        System.out.println("Ride Bicycle");
    }
    public static CycleFactory factory =
            new CycleFactory() {
                public Cycle getCycle() { return new Bicycle(); }
            };
}
