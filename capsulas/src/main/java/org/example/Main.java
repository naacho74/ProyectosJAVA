package org.example;

import Clases.Estudiante;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante=new Estudiante();

        //accedo a los metodos de encapsulamiento


        //modifica
        estudiante.setNombre("Camilo");
        estudiante.setNotaPromedio(15);




        //mostrando __ traer
        String nombre= estudiante.getNombre();
        System.out.println(nombre);

        double nota= estudiante.getNotaPromedio();
        System.out.println(nota);
    }
}