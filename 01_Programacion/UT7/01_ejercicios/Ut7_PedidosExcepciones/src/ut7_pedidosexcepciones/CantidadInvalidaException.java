
package ut7_pedidosexcepciones;

public class CantidadInvalidaException extends Exception{
    
    //Atributos
    private int cantidad;
    
    //Constructores
    public CantidadInvalidaException(int cantidad){
        super("Cantidad no válida");
        this.cantidad = cantidad;
    }

    //Metodos
    public int getCantidadInvalida() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "CantidadInvalidaException{" + "cantidad= " + cantidad + '}';
    }        
}
