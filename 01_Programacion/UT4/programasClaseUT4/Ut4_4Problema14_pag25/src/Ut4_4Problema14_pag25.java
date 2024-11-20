/*
 * @author ciclost
 */
import java.util.Scanner;
public class Ut4_4Problema14_pag25 {
    

    public static void main(String[] args) {
        
        Ut4_4Problema14_pag25 programa = new Ut4_4Problema14_pag25();
        programa.inicio();
        
    }
    
    public void inicio(){        
        int[] arrayEnt = {3,2,3,4,5,6,3,7,3};
        //introNum(); Lo que te da como resultado hay que usarlo, ya sea metiendolo en una variable o emplearlo para sacarlo por pantalla PEj.
        //contarNum(arrayEnt, introNum()); Aqui devuelve el resultado del método "contarNum" empleando los datos de arrayEnt y lo obtenido del método "introNum"
        System.out.println("Numeros rep: " + contarNum(arrayEnt, introNum()));
        
        
    }
    public int introNum (){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce numero a buscar: " );
        int numEnt = teclado.nextInt();
        return numEnt;
    }
    
    
    public int contarNum (int[]arrayEnt, int numEnt){        
        int cantNum =0;
        for(int acuNum : arrayEnt){ // Esto es un for each
            if(acuNum == numEnt){
                cantNum++;
            }
        }
        return cantNum;
    }
    
}
