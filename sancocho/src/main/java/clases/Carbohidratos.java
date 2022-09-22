package clases;

public class Carbohidratos extends Alimento {

    private int cantidad;
    private  String temperaturaDeCopcion;
    private  double tiempoCopcion;

    public Carbohidratos() {
    }

    public Carbohidratos(String nombre, int calorias, double precio, int cantidad, String temperaturaDeCopcion, double tiempoCopcion) {
        super(nombre, calorias, precio);
        this.cantidad = cantidad;
        this.temperaturaDeCopcion = temperaturaDeCopcion;
        this.tiempoCopcion = tiempoCopcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTemperaturaDeCopcion() {
        return temperaturaDeCopcion;
    }

    public void setTemperaturaDeCopcion(String temperaturaDeCopcion) {
        this.temperaturaDeCopcion = temperaturaDeCopcion;
    }

    public double getTiempoCopcion() {
        return tiempoCopcion;
    }

    public void setTiempoCopcion(double tiempoCopcion) {
        this.tiempoCopcion = tiempoCopcion;
    }

    public void preparacion(){
        System.out.println("pelar el Carbohidrato");
    }
}
