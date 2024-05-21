package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingresa cantidad satelites:");
        int satelites = sc.nextInt();
        System.out.println("Ingresa la masa en kg:");
        double masa = sc.nextDouble();
        System.out.println("Ingresa el volumen");
        double volumen = sc.nextDouble();
        System.out.println("Ingresa el diametro");
        int diametro = sc.nextInt();
        System.out.println("ingresa distancia con respecto al sol:");
        int distanciasol = sc.nextInt();
        


        Planeta planeta1 = new Planeta(null,0,0,0,0,distanciasol,false);

        planeta1.PlanetaExterior();
        planeta1.obtenerDatos();


    }
}