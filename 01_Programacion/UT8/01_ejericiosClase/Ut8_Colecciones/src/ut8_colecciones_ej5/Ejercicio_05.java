
package ut8_colecciones_ej5;

public class Ejercicio_05 {
    public static <T> boolean buscar(T elemento, T[]array){
        for(int i=0; i< array.length;i++){
            if(array[i].equals(elemento)) return true;
        }
        return false;
    }
}
