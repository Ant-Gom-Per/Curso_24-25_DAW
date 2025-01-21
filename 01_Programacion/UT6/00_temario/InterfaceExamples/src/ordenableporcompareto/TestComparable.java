/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenableporcompareto;

import java.util.Arrays;

public class TestComparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Vamos a comparar personas por su edad
        Persona p1 = new Persona("Felipe", "Inclán", 27);
        Persona p2 = new Persona("Juan", "Lino", 81);
        Persona p3 = new Persona("Marta", "Gomis", 27);
        
        System.out.println("p1 sobre p2:");
        System.out.printf("Mayor? %b Menor? %b Mayor-o-igual? %b Menor-o-igual? %b\n",
                p1.greaterThan(p2),
                p1.lessThan(p2),
                p1.greaterThanOrEqual(p2),
                p1.lessThanOrEqual(p2));
        
        System.out.println("p2 sobre p3:");
        System.out.printf("Mayor? %b Menor? %b Mayor-o-igual? %b Menor-o-igual? %b\n",
                p2.greaterThan(p3),
                p2.lessThan(p3),
                p2.greaterThanOrEqual(p3),
                p2.lessThanOrEqual(p3));
        
        System.out.println("p1 sobre p3:");
        System.out.printf("Mayor? %b Menor? %b Mayor-o-igual? %b Menor-o-igual? %b\n",
                p1.greaterThan(p3),
                p1.lessThan(p3),
                p1.greaterThanOrEqual(p3),
                p1.lessThanOrEqual(p3));
        
         // Vamos a comparar figuras por su área
         Figura f1 = new Circulo(3);
         Figura f2 = new Cuadrado(3);
         Figura f3 = new Circulo(2);
         Figura f4 = new Cuadrado(3);
         
         System.out.println("f1 sobre f2");
         System.out.printf("Mayor? %b Menor? %b Mayor-o-igual? %b Menor-o-igual? %b\n",
                f1.greaterThan(f2),
                f1.lessThan(f2),
                f1.greaterThanOrEqual(f2),
                f1.lessThanOrEqual(f2));
         
         System.out.println("f2 sobre f3");
         System.out.printf("Mayor? %b Menor? %b Mayor-o-igual? %b Menor-o-igual? %b\n",
                f2.greaterThan(f3),
                f2.lessThan(f3),
                f2.greaterThanOrEqual(f3),
                f2.lessThanOrEqual(f3));
         
         System.out.println("f2 sobre f4");
         System.out.printf("Mayor? %b Menor? %b Mayor-o-igual? %b Menor-o-igual? %b\n",
                f2.greaterThan(f4),
                f2.lessThan(f4),
                f2.greaterThanOrEqual(f4),
                f2.lessThanOrEqual(f4));
         
         // Al derivar de Comparable, automáticamente podemos usar "sort" en un Array:
         Figura[] figuras = {
             new Circulo(4),
             new Cuadrado(3),
             new Cuadrado(6),
             new Circulo(3)
         };
         System.out.println("Array sin ordenar: " + Arrays.toString(figuras));
         Arrays.sort(figuras);
         System.out.println("Array ordenado: " + Arrays.toString(figuras));
        
    }
    
}
