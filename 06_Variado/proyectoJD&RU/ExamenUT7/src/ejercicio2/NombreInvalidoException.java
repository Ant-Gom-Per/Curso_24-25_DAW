package ejercicio2;

/**
 *
 * @author Rubén Gómez Tenza
 */
public class NombreInvalidoException extends Exception {
    private String nombre;

    public NombreInvalidoException(String nombre) {
        super("Nombre inválido");
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "NombreInvalidoException{" + "nombre=" + nombre + '}';
    }
    
}
