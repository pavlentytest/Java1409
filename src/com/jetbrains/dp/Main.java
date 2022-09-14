package com.jetbrains.dp;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("another package");
        double yy = 123;
        double x = 5.6;
        float y = 5.6f;
        if(x == 10) {
            System.out.println("123");
        } else {
            System.out.println("456");
        }
        // Тернарный оператор
        String res = (x==10) ? "123" : "456";
        System.out.println(calc());

    }
    public static int calc() {
        Random r = new Random();
        ArrayList<Integer> y = new ArrayList<>();
        int b = 0, sum = 0;
        for(int i=0;i<10;i++) {
            b = r.nextInt(100);
            y.add(b);
            System.out.print(b+" ");
            sum += b;
        }
        System.out.println();
        return sum;
    }
}
