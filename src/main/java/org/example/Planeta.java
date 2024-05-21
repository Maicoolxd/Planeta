package org.example;

import java.util.Scanner;


public class Planeta {
    String nombre = null;
    int cantidadsat = 0;
    double masakg = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciasol = 0;
    boolean tipoPlaneta = false;


    Planeta(String nombre, int cantidadsat, double masakg, double volumen, int diametro, int distanciasol, boolean tipoPlaneta) {

        this.nombre = nombre;
        this.cantidadsat = cantidadsat;
        this.masakg = masakg;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciasol = distanciasol;
        this.tipoPlaneta = tipoPlaneta;

    }

    public void obtenerDatos() {
        System.out.println("Nombre: " + nombre + "\nCantidad de satelites:" + cantidadsat + "Masa en kg:" +
                masakg + "" + volumen + "" + diametro + "" + distanciasol + "" + tipoPlaneta);
    }

    public void densidad() {
        double cosciente = masakg / volumen;
        System.out.println("Densidad del Planeta: " + cosciente);

    }

    public void PlanetaExterior(){


        if ((distanciasol>=315000000) && (distanciasol<=510000000)) {
            System.out.println("Planeta exterior");


        }
        else {
            System.out.println("Planeta Interior");
        }

    }

}