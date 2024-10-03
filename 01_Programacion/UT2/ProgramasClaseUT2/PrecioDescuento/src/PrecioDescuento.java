

/**
 * @author Antonio Gómez Pérez
 * Este programa nos hace un descuento o incremento dependiendo de la cantidad introducida.
 * Empleamos el condicional simple if
 */
import java.util.Scanner;

public class PrecioDescuento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double precioCompra, precioMinimo = 100, descuento = 10, penalizacion = 30, costeAdicional = 2;
        
        System.out.print("Introduce el precio de tu compra: ");
        precioCompra = teclado.nextDouble();
        teclado.nextLine();
        if (precioCompra >= precioMinimo){
            precioCompra -= precioCompra * descuento / 100;
        }
        if (precioCompra <= penalizacion){
            precioCompra += costeAdicional;
        }
        System.out.printf("El precio de tu compra es: %.2f\n",precioCompra);
    }
        
    
    
}
