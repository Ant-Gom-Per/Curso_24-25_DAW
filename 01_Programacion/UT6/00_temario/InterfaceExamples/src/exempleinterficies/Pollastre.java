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
public class Pollastre extends Animal implements Comestible{

    @Override
    public String so() {
        return "Kikiriki!!";
    }

    @Override
    public String comEsMenja() {
        return "Frito";
    }
    
}
