package Clases;

import java.util.Scanner;

public class Tienda {

    private int cantidad;

    // constante
    private final double IVA=0.19;

    //constructores
    public Tienda() {
    }

    public Tienda(int cantidad) {
        this.cantidad = cantidad;
    }

    //  Encapsulados para maniúlar los atributos privados

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIVA() {
        return IVA;
    }
    // metodos
    public double calcularCosto(){
        Scanner entradaTeclado=new Scanner(System.in);

        System.out.printf("Digite el precio del producto: $" );
        int precio= entradaTeclado.nextInt();

        Producto papas= new Producto();
        papas.setPrecio(precio);


        int valorNeto= papas.getPrecio()*this.cantidad;
        double valorIVA= valorNeto*this.IVA;
        double valorTotal=valorNeto+valorIVA;
        return valorTotal;
    }



}
