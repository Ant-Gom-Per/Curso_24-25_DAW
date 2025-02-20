
package ut7_pedidosexcepciones;

public class Ut7_PedidosExcepciones {

    public static void main(String[] args) {
        Pedido ped01 = new Pedido(01,5, 2.3);
        Pedido ped02 = new Pedido(02,-7,5.1);
        Pedido ped03 = new Pedido(03, 10, -4.9);
        Pedido ped04 = new Pedido(04, 18, 4.9);
        
        
        GestorPedidos gest01 = new GestorPedidos();
        
        gest01.procesarPedido(ped01);
        System.out.println("-------------------------");
        gest01.procesarPedido(ped02);
        System.out.println("-------------------------");
        gest01.procesarPedido(ped03);
        System.out.println("-------------------------");
        gest01.procesarPedido(ped04);
    }    
}
