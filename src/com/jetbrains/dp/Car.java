package com.jetbrains.dp;

public class Car {
    private String name; // ""
    private int power; // 0
    private String color; // ""

    public Car(String name, int power, String color) {
        this.name = name;
        this.power = power;
        this.color = color;
    }

    public Car() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
