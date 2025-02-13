
package ut7_pedidosexcepciones;


public class Pedido {
    
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
    public double calcularTotal() throws CantidadInvalidaException{
        if(cantidad <= 0){
            throw new CantidadInvalidaException(cantidad,  "no es válida")
        }
        double total = this.cantidad * this.precioUnitario;
        return total;
    }
    
      @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + '}';
    }
    
}
