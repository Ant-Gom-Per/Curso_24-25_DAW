/*
Tienes una lista de productos con los atributos nombre (String) y precio (double). Realiza las siguientes operaciones utilizando Streams:

1.-Transforma cada producto para obtener solo su precio.
2.-Aplica un descuento del 15% a cada precio.
3.-Calcula la suma total de los precios con descuento.
4.-Muestra por pantalla el resultado de la suma con dos decimales.
 */

package ut9_ejerstreams_trans1;

import java.util.*;
import java.util.stream.*;

public class Ut9_ejerStreams_trans1 {
    
    public static void main(String[] args) {
        
            record Producto(String nombre, double precio) {}

            List<Producto> productos = List.of(
                new Producto("Laptop", 899.99),
                new Producto("Smartphone", 499.50),
                new Producto("Tablet", 299.75),
                new Producto("Monitor", 249.99),
                new Producto("Teclado", 59.99)
            );

            final double totalConDescueno = productos.stream()
                    .mapToDouble(Producto::precio)
                    .map(precio -> precio * 0.85)
                    .sum();
            System.out.printf("Total con descuento %.2f\n", totalConDescueno);
        }

    
}
