/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut9_operacionbinaria;

/**
 *
 * @author ciclost
 */
public class Ut9_operacionBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        binaria<Integer> opInt = (op1, op2) -> op1 * op2;
        
        System.out.println(opInt.aplicar(3, 4));
    }
    
}
