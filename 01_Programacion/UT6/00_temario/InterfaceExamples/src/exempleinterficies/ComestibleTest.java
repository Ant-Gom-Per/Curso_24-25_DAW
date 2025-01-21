/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleinterficies;

/**
 *
 * @author jmas
 */
public class ComestibleTest {
    
    public static void main(String[] args) {
        Comestible comestibles[] = { new Pollastre(), new Poma(), new Taronja()};
        
        for (int i = 0; i < comestibles.length; i++) {
            System.out.println(comestibles[i].comEsMenja());
        }
        
        Animal[] animals = { new Pollastre(), new Tigre()};
        
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].so());
        }
    }
}
