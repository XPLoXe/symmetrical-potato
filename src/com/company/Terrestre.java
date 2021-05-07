package com.company;

public class Terrestre extends Vehiculo{
    String patente;
    String marca;
    String modelo;
    double consumo;
    int cantRuedas;



    public Terrestre(double precio, String color, String patente, String marca, String modelo, double consumo) {
        super(precio, color);
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public Terrestre() {
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }


    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    @Override
    public String toString() {
        return "Terrestre{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                '}';
    }
}
