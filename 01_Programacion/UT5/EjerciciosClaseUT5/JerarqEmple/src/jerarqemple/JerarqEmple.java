/*
 * Ejercicio clase UT6
 */
package jerarqemple;

/**
 *
 * @author ciclost
 */
public class JerarqEmple {

    //Atributos
    private String nombre;
    
    //Constructores
    public JerarqEmple(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + nombre ;
    }
    
    
    
    
}
