package clases;

public class Alimento {
    private String nombre;
    private int calorias;
    private double precio;

    public Alimento() {
    }

    public Alimento(String nombre, int calorias, double precio) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
