/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ordenableporcompareto;

public interface Figura extends Orderable{
    double getArea();
    
    @Override
    default int compareTo(Object that){
        if(that instanceof Figura f){
            return Double.valueOf(this.getArea()).compareTo(f.getArea());
        }
        throw new IllegalArgumentException();
    }
}
