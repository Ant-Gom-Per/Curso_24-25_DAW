
package ejemplo_02_chgpt;

public class Ejemplo_02_CHGPT {
    
    public static void mostrarLibro(Libro libro){
        libro.mostrarInfo(); //Esto muestra la información del libro
    }

    public static void main(String[] args) {
        Libro libr01 = new Libro("Don Quijote", "Miguel de Cervantes");
        
        mostrarLibro(libr01);
    }    
}
