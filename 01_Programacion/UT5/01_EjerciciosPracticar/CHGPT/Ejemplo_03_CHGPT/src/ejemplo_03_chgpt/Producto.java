
package ejemplo_03_chgpt;

public class Producto {
    
    //Atributos
    public String nombre;
    public double precio;
    
    //Constructores
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Producto; " + nombre + ", Precio: " + precio);
    }
}
