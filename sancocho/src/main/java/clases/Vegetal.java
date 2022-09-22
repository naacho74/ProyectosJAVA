package clases;

public class Vegetal extends Alimento{

    private double cantidad;
    private boolean estado;

    public Vegetal() {
    }

    public Vegetal(String nombre, int calorias, double precio, double cantidad, boolean estado) {
        super(nombre, calorias, precio);
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   public void preparacion(){
       System.out.println("lavar Y cortar");
   }
}
