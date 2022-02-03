package com.assignments.assignment7.Task4;

public class Tricycle implements Cycle{
    private Tricycle() {
        System.out.println("Tricycle"); }
    @Override
    public void ride() {
        System.out.println("Ride Tricycle");
    }
    public static CycleFactory factory = new CycleFactory() {
                public Cycle getCycle()
                {
                    return new Tricycle();
                }
            };
}
