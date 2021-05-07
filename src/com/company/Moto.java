package com.company;

public class Moto extends Terrestre{
    boolean baul;
    int cilindrada;

    public Moto(double precio, String color, String patente, String marca, String modelo, double consumo, boolean baul, int cilindrada) {
        super(precio, color, patente, marca, modelo, consumo);
        this.baul = baul;
        this.cilindrada = cilindrada;
        super.setCantRuedas(2);
    }

    public boolean isBaul() {
        return baul;
    }

    public void setBaul(boolean baul) {
        this.baul = baul;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "baul=" + baul +
                ", cilindrada=" + cilindrada +
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
