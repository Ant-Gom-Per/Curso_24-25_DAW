
import circulosimple.CirculoSimple;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ciclost
 */
public class TestCirculoSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crea un circulo con radio 1
        CirculoSimple circulo1 = new CirculoSimple();
        System.out.println("El area del circulo de radio " + circulo1.radio + " es " + circulo1.getArea());
        
         //Crea un circulo con radio 25
        CirculoSimple circulo2 = new CirculoSimple(25);
        System.out.println("El area del circulo de radio " + circulo2.radio + " es " + circulo2.getArea());
        
        CirculoSimple circulo3 = new CirculoSimple(125);
        System.out.println("El area del circulo de radio " + circulo3.radio + " es " + circulo3.getArea());
    }
    
    
    
}
