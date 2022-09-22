package org.example;

import clases.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el nombre del estudiante: ");
        estudiante.setNombre(sc.nextLine());

        System.out.println("Digite la Edad: ");
        estudiante.setEdad(sc.next());

        System.out.println("Digite la nota Promedio: ");
        estudiante.setPromedio(sc.nextDouble());
    }
}