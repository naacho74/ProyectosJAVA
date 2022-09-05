package org.example;

import Clases.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tienda exito=new Tienda();
        Scanner cantidadPorTeclado=new Scanner(System.in);
        System.out.printf("Digite la Cantidad: " );

        int cantidad=cantidadPorTeclado.nextInt();
        exito.setCantidad(cantidad);

        double total=exito.calcularCosto();
        System.out.printf("El total es de: $"+total);
    }
}