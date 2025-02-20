package ejercicio2;

/**
 *
 * @author Rubén Gómez Tenza
 */
public class EdadNegativaException extends Exception {
    private int edad;

    public EdadNegativaException(int edad) {
        super("Edad negativa");
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "EdadNegativaException{" + "edad=" + edad + '}';
    }
    
}
