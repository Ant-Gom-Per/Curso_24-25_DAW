/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenableporcompareto;

public class Persona implements Orderable {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Persona p){
            return this.edad- p.edad;
        }
        throw new IllegalArgumentException();
    }
    
    
}
