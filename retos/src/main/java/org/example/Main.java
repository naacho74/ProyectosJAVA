package org.example;

import Clases.Calculadora;
import Clases.Personaje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //creo un objeto de la clase personaje

       // Personaje raton=new Personaje("RATON",90,50,7,18,100);
       // Personaje pikachu=new Personaje("SUSANA",95,32,9,18,100);

        //generar numero aleatorio entre 0 y 1

        Calculadora calculadora= new Calculadora();




        //menu
        int observador=100;
        int resultado=0;

        System.out.println("**MENU**");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir ");
        System.out.println("5. salir ");
        System.out.println("Digita numero 1");
        Scanner numero1=new Scanner(System.in);
        calculadora.setNumeroUno(numero1.nextInt());
        System.out.println("Digita numero 2");
        Scanner numero2=new Scanner(System.in);
        calculadora.setNumeroDos(numero2.nextInt());
        while(observador!=5){

            System.out.println("Escoge una Opcion del menu");
            Scanner entradaPorTeclado=new Scanner(System.in);
            observador=entradaPorTeclado.nextInt();

            if(observador==1){
             calculadora.sumar();
            } else if (observador==2) {
               calculadora.restar();
            } else if (observador==3) {
              calculadora.Multiplicar();
            } else if (observador==4){
                calculadora.dividir();
            } else if (observador==5){
                System.out.println("saliste");

                break;
        } else {

                System.out.println("Digita una Opcion Correcta");
            }
        }

    }

}