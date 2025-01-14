/*
 * Ejercicio clase UT6
 */
package jerarqemple;

/**
 * @author Antonio
 */
public class EmpleOperario extends JerarqEmple {

    public EmpleOperario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " --> operario";
    }
    
}
