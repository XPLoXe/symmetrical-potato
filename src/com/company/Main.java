package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //INSTANCIAS
        Auto auto1 = new Auto(10, "rojo", "111", "Fiat", "XR43", 15, "autazo", 5);
        Auto auto2 = new Auto(10, "verde", "222", "Fiat", "XR43", 15, "autazo", 5);
        Auto auto3 = new Auto(10, "amarillo", "333", "Fiat", "XR43", 15, "autazo", 5);
        Auto auto4 = new Auto(10, "azul", "444", "Fiat", "XR43", 15, "autazo", 5);

        Moto moto1 = new Moto(7, "rojo", "555", "Zanella", "sapucai", 8, false, 150);
        Moto moto2 = new Moto(7, "verde", "666", "Zanella", "sapucai", 8, true, 150);
        Moto moto3 = new Moto(7, "azul", "777", "Zanella", "sapucai", 8, false, 150);

        Yate yate1 = new Yate(100, "rojo");
        Yate yate2 = new Yate(100, "blanco");

        //INVENTARIO
        List<Vehiculo> inventario = new ArrayList<>();
        inventario.add(auto1);
        inventario.add(auto2);
        inventario.add(auto3);
        inventario.add(auto4);
        inventario.add(moto1);
        inventario.add(moto2);
        inventario.add(moto3);
        inventario.add(yate1);
        inventario.add(yate2);

        // PRINT INVENTARIO
        for(Vehiculo variable : inventario){
            System.out.println(variable.toString());
        }



    }
}
