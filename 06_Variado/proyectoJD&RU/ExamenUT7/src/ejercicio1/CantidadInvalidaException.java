package ejercicio1;

/**
 *
 * @author Rubén Gómez Tenza
 */
public class CantidadInvalidaException extends Exception {
    private double cantidad;

    public CantidadInvalidaException(double cantidad) {
        super("Cantidad invalida");
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "CantidadInvalidaException{" + "cantidad=" + cantidad + '}';
    }
    
}
