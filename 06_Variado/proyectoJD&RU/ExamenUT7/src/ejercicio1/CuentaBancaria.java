package ejercicio1;

/**
 *
 * @author Rubén Gómez Tenza
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    public void ingresar (double cantidad) throws CantidadInvalidaException{
        if (cantidad < 0) throw new CantidadInvalidaException(cantidad);
        saldo += cantidad;
    }
    
    public void retirar (double cantidad) throws CantidadInvalidaException, SaldoInsuficienteException{
        if (cantidad < 0) throw new CantidadInvalidaException(cantidad);
        if (this.saldo - cantidad < 0) throw new SaldoInsuficienteException(saldo);
        saldo -= cantidad;
    }
    
}
