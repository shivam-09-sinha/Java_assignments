package com.assignments.assignment7.Task2;

    public static void main(String[] args) {
        Cycle[] cycles=new Cycle[3];
        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();

        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();

        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
        ((Tricycle)cycles[2]).balance();
}

}
