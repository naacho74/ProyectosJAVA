package org.livp;

import clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // crear un objeto de la clase Producto
        int edad=33;

        Producto producto= new Producto();

        //crear un objeto de la clase Scanner
        Scanner entradaPorTeclado=new Scanner(System.in);

        //preguntarle al usuario el nombre del producto

        System.out.println("Digite el Nombre del Producto");
        producto.nombre=entradaPorTeclado.next();
        System.out.println("el producto es "+ producto.nombre);

        //quiero crear un objeto de la clase Cliente

        //crear un objeto de la clase Cliente
        Cliente cliente=new Cliente();

        //pedir datos
        System.out.println("Digite su nombre: ");
        cliente.nombre=entradaPorTeclado.next();
        System.out.println("Digite numero de Cedula: ");
        cliente.cedula=entradaPorTeclado.next();
        System.out.println("Digite la Edad: ");
        cliente.edad=entradaPorTeclado.next();


    }
}