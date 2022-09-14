package com.jetbrains.dp;

public class ECar extends Car {
    private int capacity;

    public ECar(String name, int power, String color, int capacity) {
        super(name, power, color);
        this.capacity = capacity;
        int k = 0;
        if(this.capacity > 100) {
            k = 12;
        }
        k = 13;
        int[] x = new int[10]; // 0 , 0, .....
        //int y[] = new int[5];
        x[5] = 12;
        int[][] y = new int[4][];
        y[0] = new int[10];
        y[1] = new int[]{6,7,12};
        y[2] = new int[]{6,12,100,67,90};
        y[3] = new int[]{6};
        for(Integer i: y[0]) {
            System.out.println(i);
        }




    }
    public ECar() {

    }
}
