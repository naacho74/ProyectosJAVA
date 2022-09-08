package clases;
/*La biblioteca de Alejandría necesita de sus servicios para registrar
libros en su sistema de cómputo (NOMBRE LIBRO, CÓDIGO, NUMERO
DE PÁGINAS, NUMERO DE EJEMPLARES, AUTOR). Se debe poder
consultar la información de un libro en cualquier momento y modificar el
número de ejemplares.*/
public class Libros {

private String nombre;
private String codigo;
private String paginas;
private   int ejemplares;
private String autor;


    public Libros(String nom,String cod, String pag, int ejem, String aut) {
        nombre="";
        codigo="";
        paginas="";
        ejemplares=0;
        autor="";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
