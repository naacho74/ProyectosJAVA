package Clases;

public class Personaje {

    //atributos
    String nombre;
    int poderPatada;
    int poderGolpe;
    int defensa;
    int superPoder;
    int cantidadVida;

    //constructor


    public Personaje() {
    }

    public Personaje(String nombre, int poderPatada, int poderGolpe, int defensa, int superPoder, int cantidadVida) {
        this.nombre = nombre;
        this.poderPatada = poderPatada;
        this.poderGolpe = poderGolpe;
        this.defensa = defensa;
        this.superPoder = superPoder;
        this.cantidadVida = cantidadVida;
    }

    //metodos
    //me estan atacando
    public  void atacar(int ataqueEnemigo){
     this.cantidadVida=this.cantidadVida-ataqueEnemigo;

    }
    public void defender(int ataqueEnemigo){
        this.cantidadVida=this.cantidadVida-(ataqueEnemigo-this.defensa);
    }

    public  void aplicarSuperPoder(boolean poder){
        if(poder==true){//agregar ataque
        this.poderGolpe=this.poderGolpe+this.superPoder;

        }else{//agregar defensa
         this.defensa=this.defensa+this.superPoder;
        }
    }
}