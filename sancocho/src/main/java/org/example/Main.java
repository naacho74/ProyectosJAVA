package org.example;

import clases.Carbohidratos;
import clases.Condimento;
import clases.Proteina;
import clases.Vegetal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carbohidratos papaCapira=new Carbohidratos();
        Carbohidratos yuca=new Carbohidratos();
        Carbohidratos platano=new Carbohidratos();
        Proteina pollo=new Proteina();
        Proteina res=new Proteina();
        Proteina cerdo=new Proteina();
        Vegetal zanahoria=new Vegetal();
        Vegetal lechuga=new Vegetal();
        Vegetal aguacate=new Vegetal();
        Condimento sal=new Condimento();
        Condimento trigusal=new Condimento();
        Condimento caldoNor=new Condimento();


        Scanner sc= new Scanner(System.in);
        int centinela=0;

        System.out.println("**Preparando Sancocho**");

        while (centinela<20){

            System.out.println("paso 1.");
            System.out.println("llenar la olla con agua");
            System.out.println("paso 2.");
            System.out.println("Iniciamos con la carne de res.");
            res.setPorcentaje(0.15);
            res.setNombre("pecho");
            res.setClasificacion("terciaria");
            res.setCalorias(250);
            res.setPrecio(15000);
            res.preparacion();
        }
    }
}