package com.company;

public class Vehiculo {
    double precio;
    String color;

    public Vehiculo() {
    }

    public Vehiculo(double precio, String color) {
        this.precio = precio;
        this.color = color;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
