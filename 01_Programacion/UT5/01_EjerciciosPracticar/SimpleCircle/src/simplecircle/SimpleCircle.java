/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecircle;

/**
 *
 * @author acliv
 */
public class SimpleCircle {
    // Atributos
    public double radius;
    
    // Métodos constructores
    public SimpleCircle(){
        radius = 1;
    }
    
    public SimpleCircle(double newRadius){
        radius = newRadius;
    }
    
    // Otros métodos
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    public void setRadius(double newRadius){
        if (newRadius > 0){
            radius = newRadius;
        }
    }
    
    
}
