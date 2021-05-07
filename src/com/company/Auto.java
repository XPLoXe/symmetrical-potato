package com.company;

public class Auto extends Terrestre{
    String prestaciones;
    int cambio;


    public Auto(double precio, String color, String patente, String marca, String modelo, double consumo, String prestaciones, int cambio) {
        super(precio, color, patente, marca, modelo, consumo);
        this.prestaciones = prestaciones;
        this.cambio = cambio;
        super.setCantRuedas(4);
    }


    public String getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(String prestaciones) {
        this.prestaciones = prestaciones;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "prestaciones='" + prestaciones + '\'' +
                ", cambio=" + cambio +
                ", patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
