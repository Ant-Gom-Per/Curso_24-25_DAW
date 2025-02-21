
package ejemplo_04_chgpt;

public class Persona {
    
    //Atributos
    public String nombre;
    public int edad;
    
    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    
}
