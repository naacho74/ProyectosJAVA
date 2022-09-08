package org.example;
/*1. Una compañía de software contable, paga a su personal de ventas un
salario de 3500000 mensuales, más una comisión de 1500000 por cada
licencia de software vendida menos el (5% de deducciones) por
impuestos. Codifica un programa que calcule e imprima el salario
mensual de un vendedor dado recibiendo el número de ventas
realizadas (CREE LAS CLASES QUE NECESITE) */
import clases.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();
        Scanner sc =new Scanner(System.in);
        System.out.println("Digita el nombre del empleado: ");
        empleado.setNombre(sc.nextLine());
        System.out.println("digite la identificacion del empleado: ");
        empleado.setIdentificacion(sc.nextLine());
        empleado.calcularComision();
        empleado.calcularSalario();
        System.out.println("Nombre del Empleado: "+empleado.getNombre());
        System.out.println("Identificacion del empleado: "+empleado.getIdentificacion());
        System.out.println("La deduccion es de: "+empleado.getDeducciones());
        System.out.println("Numero de ventas: "+empleado.getNumeroVentas());
        System.out.println("La comision es de: "+empleado.getComision());

        System.out.println("El Salario neto es de : $"+empleado.getSalarioNeto());


    }
}