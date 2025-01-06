
import personainicial.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acliv
 */
public class TestPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("75831148V", "David Mallorca", 19);
        Persona persona2 = persona1;
        Persona persona3 = persona1.clonar();
        
        
        persona2.setEdad(43);
        persona3.setEdad(25);
        
        persona1.visualizar();
        persona2.visualizar();
        persona3.visualizar();
        
        
//        System.out.println(persona1.equals(persona2));
//        System.out.println(persona1.equals(persona3));
//       
//        System.out.println(persona1 == persona2);
//        System.out.println(persona1 == persona3);
//        
        
    }
    
}
