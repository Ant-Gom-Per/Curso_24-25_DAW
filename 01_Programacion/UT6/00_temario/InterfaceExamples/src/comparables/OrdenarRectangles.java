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
public class OrdenarRectangles {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
            new Rectangle(3, 5),
            new Rectangle(2, 5),
            new Rectangle(8, 9),
            new Rectangle(1, 2)};
        
        Arrays.sort(rectangles);
        
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
        
        Cercle[] cercles = {
            new Cercle(3),
            new Cercle(5),
            new Cercle(1),
            new Cercle(9)};
        
        Arrays.sort(cercles);
        
        for (Cercle cercle : cercles) {
            System.out.println(cercle);
        }
    }
}
