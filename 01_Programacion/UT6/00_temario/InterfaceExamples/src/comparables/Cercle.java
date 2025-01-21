/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparables;

/**
 *
 * @author jmas
 */
public class Cercle implements FormaComparable{
    private int radi;

    public Cercle(int radi) {
        this.radi = radi;
    }

    

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radi, 2);
    }

    @Override
    public double getPerimetre() {
        return 2 * Math.PI * radi;
    }

    @Override
    public String toString() {
        return "Radi=" + radi + " Àrea= " + getArea();
    }
    
    
}
