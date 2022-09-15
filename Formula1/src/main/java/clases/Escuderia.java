package clases;

public class Escuderia {

  private String nombre;
  private String casaMotor;
  private int costoAnual;

    public Escuderia() {
    }

    public Escuderia(String nombre, String casaMotor, int costoAnual) {
        this.nombre = nombre;
        this.casaMotor = casaMotor;
        this.costoAnual = costoAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasaMotor() {
        return casaMotor;
    }

    public void setCasaMotor(String casaMotor) {
        this.casaMotor = casaMotor;
    }

    public int getCostoAnual() {
        return costoAnual;
    }

    public void setCostoAnual(int costoAnual) {
        this.costoAnual = costoAnual;
    }
}
