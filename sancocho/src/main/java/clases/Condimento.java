package clases;

public class Condimento extends Alimento{

    private String marca;
    private String color;

    public Condimento() {
    }

    public Condimento(String nombre, int calorias, double precio, String marca, String color) {
        super(nombre, calorias, precio);
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void preparacion(){
        System.out.println("utilizar el condimento");
    }
}
