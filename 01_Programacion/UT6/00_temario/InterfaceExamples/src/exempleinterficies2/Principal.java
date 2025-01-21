/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleinterficies2;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Felipe Pérez", 23);
        Persona p2 = new Persona("María Llopis", 35);
        System.out.println(p1.sumar(p2));
        
        Rectangle r1 = new Rectangle(10, 23);
        Rectangle r2 = new Rectangle(4, 25);
        System.out.println(r1.restar(r2));
        
        // POLIMORFISME D'INTERFÍCIE    
        // Amb "operable" ens assegurem que els objectes que passem es podran restar (i per tant comparar si el primer es major)
        
        System.out.println(esMajor(r1, r2));
        System.out.println(esMajor(p1, p2));
        
        //System.out.println(esMajor(r1, p2));
        
    }
    
    public static boolean esMajor(Operable o1, Operable o2){
        return o1.restar(o2) > 0;
    }
    
}
