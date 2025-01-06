/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personainicial;

import java.util.Objects;
import java.util.logging.Logger;


public class Persona {
    // ATRIBUTOS
    private String dni;
    private String nombre;
    private int edad;
    
    // MÉTODOS CONSTRUCTORES

    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(Persona per1){
        this.dni = per1.getDni();
        this.nombre = per1.getNombre();
        this.edad = per1.getEdad();
    }
    
    // OTROS MÉTODOS
    
    public Persona clonar(){
        return new Persona(this);
    }

    public void visualizar() {
        System.out.println("DNI: "+dni+" | "+"Nombre: "+nombre+" | "+"Edad: "+edad);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.dni);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + this.edad;
        return hash;
    }
    
    
    
    
}
