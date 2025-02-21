/*
 *  Ejercicio 4: Comprobación de igualdad de objetos
    Objetivo: Comparar dos objetos de una clase para ver si son iguales según sus atributos.
    Descripción: Crea una clase Persona con los atributos nombre y edad. Luego, crea un método
    que reciba dos objetos Persona y compare si tienen el mismo nombre y edad.
 */
package ejemplo_04_chgpt;

public class Ejemplo_04_CHGPT {
    
    public static boolean sonIguales(Persona p1, Persona p2){
        return p1.nombre.equals(p2.nombre) && p1.edad == p2.edad;
    }

    public static void main(String[] args) {
        Persona per01 = new Persona("Ana", 30);
        Persona per02 = new Persona("Ana", 30);
        Persona per03 = new Persona("Luis", 25);
        
        System.out.println("per01 y per02 son iguales? " + sonIguales(per01,per02));
        System.out.println("per02 y per03 son iguales? " + sonIguales(per02,per03));
    }
    
}
