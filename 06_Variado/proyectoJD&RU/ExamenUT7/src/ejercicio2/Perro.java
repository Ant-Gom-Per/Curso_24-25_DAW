package ejercicio2;

/**
 *
 * @author Rubén Gómez Tenza
 */
public class Perro {
    private String nombre;
    private int edad;

    public Perro(String nombre, int edad) throws NombreInvalidoException, EdadNegativaException {
        if (nombre.length() < 3) throw new NombreInvalidoException(nombre);
        this.nombre = nombre;
        if (edad < 0) throw new EdadNegativaException(edad);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreInvalidoException {
        if (nombre.length() < 3) throw new NombreInvalidoException(nombre);
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadNegativaException {
        if (edad < 0) throw new EdadNegativaException(edad);
        this.edad = edad;
    }
    
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
