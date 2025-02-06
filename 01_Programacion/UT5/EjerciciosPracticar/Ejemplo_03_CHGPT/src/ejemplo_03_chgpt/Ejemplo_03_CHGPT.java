/**
 *  Ejercicio 3: Pasar varios objetos como parámetros
    Objetivo: Pasar varios objetos a un método y realizar una operación con ellos.
    Descripción: Crea una clase Producto con los atributos nombre y precio. Luego, crea un
    método que reciba dos objetos Producto y calcule el total de su precio sumando ambos precios.      
 */
package ejemplo_03_chgpt;

public class Ejemplo_03_CHGPT {
    
    public static void calcularTotal(Producto producto1, Producto producto2){
        double total = producto1.precio + producto2.precio;
        System.out.println("El total es: " + total);
    }

    public static void main(String[] args) {
        Producto prod01 = new Producto("Camiseta", 15.0);
        Producto prod02 = new Producto("Pantalón", 25.0);
        
        prod01.mostrarInfo();
        prod02.mostrarInfo();
        calcularTotal(prod01, prod02);
        
    }
    
}
