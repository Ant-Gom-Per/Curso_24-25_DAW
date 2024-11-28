/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumprova;

import java.util.Arrays;

/**
 *
 * @author jmas
 */
public class EnumProva {

    enum Cicle{
        SMX, ASIX, DAM, DAW;
    }
    public static void main(String[] args) {
        Cicle cicle = Cicle.DAW;
        System.out.println(cicle);
        System.out.println(cicle.ordinal());
        System.out.println(Arrays.toString(Cicle.values()));
        //cicle = "DAW";
        //cicle = Cicle.FOL;
        /*
        cicle = Cicle.valueOf("FOL");
        System.out.println(cicle);
        */
        
        cicle = Cicle.valueOf("DAM");
        System.out.println(cicle);
        
        
        cicle = Cicle.values()[1];
        System.out.println(cicle);
        
        
        for(Cicle unCicle: Cicle.values()){
            System.out.println("Cicle: " + unCicle.name());
        }
        
    }
    
}
