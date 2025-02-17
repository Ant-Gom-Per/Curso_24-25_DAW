package ejercicio1;

/**
 *
 * @author Rubén Gómez Tenza
 */
public class SaldoInsuficienteException extends Exception {
    private double saldo;
    
    public SaldoInsuficienteException(double saldo) {
        super("Saldo insuficiente");
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "SaldoInsuficienteException{" + "saldo=" + saldo + '}';
    }
}
