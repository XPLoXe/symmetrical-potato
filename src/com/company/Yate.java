package com.company;

public class Yate extends Acuatico{


    public Yate(double precio, String color) {
        super(precio, color);
    }

    @Override
    public String toString() {
        return "Yate{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
