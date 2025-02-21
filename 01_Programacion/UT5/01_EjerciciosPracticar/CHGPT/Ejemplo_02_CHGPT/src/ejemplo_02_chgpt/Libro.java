
package ejemplo_02_chgpt;

public class Libro {
    
    //Atributos
    public String titulo;
    public String autor;
    
    //Constructor

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Metodo
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + ", Autor: " + autor);
    }
}
