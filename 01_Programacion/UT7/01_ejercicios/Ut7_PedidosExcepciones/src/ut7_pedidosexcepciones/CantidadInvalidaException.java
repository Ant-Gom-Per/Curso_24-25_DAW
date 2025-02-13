/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut7_pedidosexcepciones;

/**
 *
 * @author ciclost
 */
public class CantidadInvalidaException extends Exception{
    private int cantidadInvalida;
    
    public CantidadInvalidaException(int cantidadInvalida, String message){
        super(message);
        this.cantidadInvalida = cantidadInvalida;
    }

    public int getCantidadInvalida() {
        return cantidadInvalida;
    }
    
    
}
