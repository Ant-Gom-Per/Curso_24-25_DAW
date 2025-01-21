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
public class Rectangle implements FormaComparable{
    private int ample;
    private int alt;

    public Rectangle(int ample, int alt) {
        this.ample = ample;
        this.alt = alt;
    }

    @Override
    public double getArea() {
        return ample*alt;
    }

    @Override
    public double getPerimetre() {
        return (ample + alt) * 2;
    }

    @Override
    public String toString() {
        return "Ample=" + ample + " Alt=" + alt + " Àrea= " + getArea();
    }
    
    
}
