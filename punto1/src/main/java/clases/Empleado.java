package clases;
/*1. Una compañía de software contable, paga a su personal de ventas un
salario de 3500000 mensuales, más una comisión de 1500000 por cada
licencia de software vendida menos el (5% de deducciones) por
impuestos. Codifica un programa que calcule e imprima el salario
mensual de un vendedor dado recibiendo el número de ventas
realizadas (CREE LAS CLASES QUE NECESITE) */

import java.util.Scanner;

public class Empleado {

    private String nombre;
    private String identificacion;
    private int numeroVentas;
    private double comision;
    private final int SALARIOMENSUAL= 3500000;
    private double deducciones;

    private double salarioNeto;


    public Empleado() {
    }

    public Empleado(String nombre, String identificacion, int numeroVentas, double comision, double deducciones, double salarioNeto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.numeroVentas = numeroVentas;
        this.comision = comision;
        this.deducciones = deducciones;
        this.salarioNeto = salarioNeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getSALARIOMENSUAL() {
        return SALARIOMENSUAL;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    //metodo
    public double calcularComision(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite las deducciones del Empleado: ");
        this.deducciones=sc.nextDouble();
        System.out.println("digite la cantidad de ventas");
        this.numeroVentas= sc.nextInt();

        if (this.numeroVentas>0){
            return this.comision= this.numeroVentas* (1500000 -(this.deducciones*0.5));

        }else{

           return this.comision= 0;


        }
    }

    public  double calcularSalario(){

    return this.salarioNeto =this.SALARIOMENSUAL+this.comision-this.deducciones;

    }
}
