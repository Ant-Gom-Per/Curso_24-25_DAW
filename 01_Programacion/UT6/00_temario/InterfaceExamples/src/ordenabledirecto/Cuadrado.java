/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenabledirecto;

public class Cuadrado implements Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.lado) ^ (Double.doubleToLongBits(this.lado) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof Figura f) {
            return this.getArea() == f.getArea();
        }
        return false;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

}
