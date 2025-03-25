/*
 * Propuesta de ejercicio para repaso de Ra3.
   Este ejercicio reune todos los elementos del la Ut2 e incluye elementos de la Ut7
 */
package ra3_ejercicios;

public class Ra3_InvalidSNexceptio  extends Exception{
    
    //Atributo
    private String continuar;
    
    //Constructor
    public Ra3_InvalidSNexceptio(){
        super();
    }

    public String getContinuar() {
        return continuar;
    }

    @Override
    public String toString() {
        return "Ra3_InvalidSNexceptio{" + "continuar=" + continuar + '}';
    }
    
}
