/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ordenabledirecto;

public interface Figura extends Orderable{
    double getArea();
    
    @Override
    default boolean lessThan(Object that){
        if(that instanceof Figura f){
            return this.getArea() < f.getArea();
        }
        return false;
    }
}
