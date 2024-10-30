/*
ejercicio3_1 nº 3
comparar matrices
 */

public class ComparaArrays {

    public static void main(String[] args) {
        int [] arrayA = {1, 2, 3, 4, 5};
        int [] arrayB = {1, 2, 3, 4, 5};
        boolean iguales =true;
        if(arrayA.length != arrayB.length){
            iguales = false;

        }else{
            for(int i = 0 ; i < arrayA.length ; i++){
                if(arrayA[i] != arrayB[i]){
                    iguales = false;
                    break;
                }
            }
        }
        String mensaje = iguales ? "Iguales" : "Diferentes";
        System.out.println(mensaje);
        
    }
    
}
