package Clases;

public class Producto {

    private String nombreProducto;
    private int precio;
    private String marca;

    public Producto() {
    }

    public Producto(String nombreProducto, int precio, String marca) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.marca = marca;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
