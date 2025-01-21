/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenabledirecto;

public class Circulo implements Figura{
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.radio) ^ (Double.doubleToLongBits(this.radio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object that){
        if(that instanceof Figura f){
            return this.getArea() == f.getArea();
        }
        return false;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    
    
}
