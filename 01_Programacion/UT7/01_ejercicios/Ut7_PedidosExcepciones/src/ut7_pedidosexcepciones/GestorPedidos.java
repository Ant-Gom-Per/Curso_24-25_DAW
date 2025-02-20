
package ut7_pedidosexcepciones;

public class GestorPedidos {
    public void procesarPedido(Pedido pedido){
        try{
            double total = pedido.calcularTotal();
            System.out.println("El total del pedido " + pedido.getId() + " es de " + total);
        }catch(CantidadInvalidaException e){
            System.out.println("Error en el pedido " + pedido.getId());
            System.out.println(e);
        }catch(PrecioInvalidoException ex){
            System.out.println("Error en el pedido " + pedido.getId());
            System.out.println(ex);
        }finally{
            System.out.println("Operacion finalizada para el pedido " + pedido.getId());
        }
        
    }
    
}
