/*
 * Ejercicio clase UT6
 */
package jerarqemple;

/**
 *
 * @author ciclost
 */
public class EmpleDIrectivo extends JerarqEmple{

    public EmpleDIrectivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " --> directivo";
    }

    
    
}
