/*
 * Practica 3 temario UT5
 */
package personaut5;

//Esto es la clase
public class PersonaUt5 {
    
    //Atributos
    private String dni;
    private String nombre;
    private int edad;
    
    //Constructores
    public PersonaUt5(String dni, String nombre, int edad){
        this.dni = dni;
        this.nombre = nombre;
        if(edad >= 0 && edad < 200) this.edad = edad;        
    }
    
    //Metodos
    public void visualizar(){
        System.out.println("La persona tiene:");
        System.out.println("Dni: " + dni + "\nNombre: " + nombre + "\nEdad: " + edad + " años.\n-------------");
    }   
}
