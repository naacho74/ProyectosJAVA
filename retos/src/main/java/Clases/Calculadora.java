package Clases;

import java.util.Scanner;

public class Calculadora {


   private int numeroUno = 0;
   private int numeroDos = 0;

    public Calculadora() {
    }

    public Calculadora(int numeroUno, int numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    //Getet and setter

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    //metodos
    public int sumar() {
        return (this.numeroUno + this.numeroDos);
    }

    public int restar() {
        return (this.numeroUno - this.numeroDos);
    }

    public int Multiplicar() {
        return (this.numeroUno * this.numeroDos);
    }

    public double dividir() {
        return (this.numeroUno / this.numeroDos);
    }
}