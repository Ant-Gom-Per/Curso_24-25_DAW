
package ut7_pedidosexcepciones;

public class PrecioInvalidoException extends Exception{
    
    //Atributo
    private double precio;
    
    //Constructor
    public PrecioInvalidoException(double precio){
        super("Precio no válido");
        this.precio = precio;
    }
    
    //Métodos
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "PrecioInvalidoException{" + "precio= " + precio + '}';
    }
    
    
}
