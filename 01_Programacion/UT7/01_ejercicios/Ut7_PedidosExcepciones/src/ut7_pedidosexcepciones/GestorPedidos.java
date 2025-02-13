/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut7_pedidosexcepciones;

/**
 *
 * @author ciclost
 */
public class GestorPedidos {
    public void procesarPedido(Pedido pedido){
        try{
            double total = pedido.calcularTotal();
            System.out.println("El total del pedido " + pedido.getId());
        }catch(CantidadInvalidaException e){
            
        }
    }
    
}
