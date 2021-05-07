package com.company;

public class Acuatico extends Vehiculo{

    public Acuatico() {
    }

    public Acuatico(double precio, String color) {
        super(precio, color);
    }

    @Override
    public String toString() {
        return "Acuatico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
