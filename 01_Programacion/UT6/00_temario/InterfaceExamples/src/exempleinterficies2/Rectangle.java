/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleinterficies2;

public class Rectangle implements Operable{
    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getArea(){
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double sumar(Object altre) {
        assert altre instanceof Rectangle;
        return this.getArea() + ((Rectangle)altre).getArea();
    }

    @Override
    public double restar(Object altre) {
        assert altre instanceof Rectangle;
        return this.getArea() - ((Rectangle)altre).getArea();
    }

  
    
    
    
    
}
