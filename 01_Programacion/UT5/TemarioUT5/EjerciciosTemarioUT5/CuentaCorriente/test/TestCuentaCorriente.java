/*
 * Ejercicio cuenta corriente Ut5
 */

import cuentacorriente.CuentaCorriente;

public class TestCuentaCorriente {

    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("22115389S", "Conchi");
        CuentaCorriente cuenta2 = new CuentaCorriente("44765422Q", "Antonio");
        CuentaCorriente cuenta3 = new CuentaCorriente("11222333A", "Perico");
        cuenta1.verInformacion();
        cuenta1.ingresarDinero(100);
        cuenta1.verInformacion();
        cuenta1.sacarDinero(150);
        cuenta1.ingresarDinero(100);
        cuenta1.verInformacion();
        cuenta1.sacarDinero(150);
        cuenta1.verInformacion();
        
        cuenta2.ingresarDinero(200);
        cuenta2.verInformacion();
        
        cuenta3.verInformacion();
    }
    
}
