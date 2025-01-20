/*
 * Ejercicio practicar UT5
 */
import numcomplejos.NumComplejos;
/**
 * @author ANtonio
 */
public class TestNumComplejos {

    public static void main(String[] args) {
        NumComplejos val01 = new NumComplejos(3,4);
        NumComplejos val02 = new NumComplejos(5, 6);
        NumComplejos val03 = new NumComplejos();
                             
        System.out.println("Valor 01: " + val01.toString());
        System.out.println("Valor 02: " + val02.toString());
        System.out.println("Valor 03: " + val03.toString());
        val03.setReal(7);
        val03.setImaginaria(8);
        
        System.out.println("Valor 1 + valor 2 = " + val01.sumar(val02));
        System.out.println("Valor 1 * valor 2 = " + val01.producto(val02));
        System.out.println("Valor 03: " + val03.toString());
        System.out.println("(Valor 1 + valor 2) + valor 3 = " + val03.sumar(val01.sumar(val02)));
        
    }
    
}
