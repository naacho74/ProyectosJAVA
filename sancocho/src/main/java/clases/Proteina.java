package clases;

public class Proteina extends Alimento{

  private double porcentaje;
  private  String Clasificacion;

  public Proteina() {
  }

  public Proteina(String nombre, int calorias, double precio, double porcentaje, String clasificacion) {
    super(nombre, calorias, precio);
    this.porcentaje = porcentaje;
    Clasificacion = clasificacion;
  }

  public double getPorcentaje() {
    return porcentaje;
  }

  public void setPorcentaje(double porcentaje) {
    this.porcentaje = porcentaje;
  }

  public String getClasificacion() {
    return Clasificacion;
  }

  public void setClasificacion(String clasificacion) {
    Clasificacion = clasificacion;
  }

  public void preparacion (){
    System.out.println("porcionar y cocinar");
  }
}
