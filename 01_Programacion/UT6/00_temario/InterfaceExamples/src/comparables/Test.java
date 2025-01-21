/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparables;

import java.util.Arrays;

/**
 *
 * @author jmas
 */
public class Test {
    public static void main(String[] args) {
        Persona[] personas = {new Persona(3), new Persona(2), new Persona(4)};
        Arrays.sort(personas);
    }
}
