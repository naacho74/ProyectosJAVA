package clases;

public class Persona {
    private String nombre;
    private String edad;


    public Persona() {
    }

    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
       if (Integer.parseInt(edad)<110){

           this.edad = edad;
       } else {
           System.out.println("digite una edad valida");
       }

    }

    public  void saludar(){
        System.out.println("hola "+ this.nombre);
    }
}
