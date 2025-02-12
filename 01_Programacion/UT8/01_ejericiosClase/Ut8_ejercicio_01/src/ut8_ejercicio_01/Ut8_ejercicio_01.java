/**
 * 1.- Crea un ArrayList capaç d'emmagatzemar els valors: "hola", 2.5, false, "adéu"
 */
package ut8_ejercicio_01;

import java.util.ArrayList;
import java.util.List;

public class Ut8_ejercicio_01 {

    public static void main(String[] args) {
        ArrayList <Object> almacena = new ArrayList<>(List.of ("hola", 2.5, false, "adeu"));
        for (Object element : almacena){
            System.out.println(element);
        }
    }
    
}
