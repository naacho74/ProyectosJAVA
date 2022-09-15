package org.example;

import clases.Escuderia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Escuderia[] escuderias=new Escuderia[10];

        String[] nombres=new  String[5];

        //recorriendo para llenarlo
        for (int i=0;i<nombres.length;i++){

            System.out.println("digite el nombre" +(i+1));
            nombres[i]=sc.next();
        }
    // recorrer arreglo para mostrar que tiene dentro
        for (int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }

    }
}