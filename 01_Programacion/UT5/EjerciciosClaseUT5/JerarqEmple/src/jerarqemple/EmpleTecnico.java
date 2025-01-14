/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerarqemple;

/**
 *
 * @author ciclost
 */
public class EmpleTecnico extends EmpleOperario{

    public EmpleTecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " --> tecnico";
    }
    
    
}
