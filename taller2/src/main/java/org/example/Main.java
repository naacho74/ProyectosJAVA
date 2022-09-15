package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import clases.Cliente;
import clases.Empanada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss" );
        Empanada empanada=new Empanada("Empanada de Papa Y Carne","papa y carne",5000,1200);
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("***MENU***");
        System.out.println("1. Agregar Empanadas");
        System.out.println("2. Ver Empanada");
        System.out.println("3. Editar precio Empanada");
        while (opcion != 5) {
            System.out.println("dijite una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Digita el nombre del Cliente");
                cliente.setNombre(sc.next());
                System.out.print("digita el Saldo disponible: $");
                cliente.setSaldoDisponible(sc.nextDouble());
                if (cliente.getSaldoDisponible()>=5000){
                    System.out.println("El Precio de la empanada es: $"+empanada.getPrecioVenta());
                    System.out.println("Los Ingredientes De la Empanada son: "+empanada.getIngrediente());
                    System.out.println("Digite Cantidad de empanada deseada: ");
                    empanada.setCantidad(sc.nextInt());
                }

                if (empanada.calcularVenta()> cliente.getSaldoDisponible()){
                    System.out.println("no tienes saldo disponible");
                    System.out.println("digita una cantidad menor");
                    empanada.setCantidad(sc.nextInt());
                } else {
                    cliente.setSaldoDisponible(cliente.getSaldoDisponible()- empanada.calcularVenta());
                    System.out.println("gracias por tu compra");
                    System.out.println("su nuevo saldo es: $"+cliente.getSaldoDisponible());
                }

            } else if (opcion == 2) {
                System.out.println("Empanadas La Loma");
                System.out.println("Regimen Comun 12345678");
                System.out.println(dtf.format(LocalDateTime.now()));
                System.out.println("");
                System.out.println("nombre Empanada: "+empanada.getNombre());
                System.out.println("Valor de empanada: " +empanada.getPrecioVenta());
                System.out.println("candidad de empanadas: "+ empanada.getCantidad());
                System.out.println("valor de la Compra: "+ empanada.calcularVenta());
                System.out.println("**** Gracias Por Tu Compra "+cliente.getNombre() +" ****");
            } else if (opcion == 3) {

            } else if (opcion==5) {

            } else {

            }
        }

    }

}