package clases;

public class Estudiante extends Persona {

    private  double promedio;

    public Estudiante() {
    }

    public Estudiante(String nombre, String edad, double promedio) {
        super(nombre, edad);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
