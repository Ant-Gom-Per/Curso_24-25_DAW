/*
 * Ejercicio clase UT6e
 */
package jerarqemple;

/**
 *
 * @author ciclost
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
