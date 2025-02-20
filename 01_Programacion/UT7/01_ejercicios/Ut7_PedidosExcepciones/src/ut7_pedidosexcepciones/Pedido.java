package ut7_pedidosexcepciones;

import java.util.Scanner;

public class Pedido {
    
    Scanner teclado = new Scanner(System.in);
    
    //Atributos
    private int id;
    private int cantidad;
    private double precioUnitario;

    //constructor
    public Pedido(int id, int cantidad, double precioUnitario) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    //metodos     
    public double calcularTotal() throws CantidadInvalidaException, PrecioInvalidoException{
        if(cantidad <= 0) throw new CantidadInvalidaException(cantidad);
        if(precioUnitario <=0) throw new PrecioInvalidoException(precioUnitario);
        
        return this.cantidad * this.precioUnitario;
    }

    public int getId() {
        return id;
    }
    
        
      @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + '}';
    }
    
}
