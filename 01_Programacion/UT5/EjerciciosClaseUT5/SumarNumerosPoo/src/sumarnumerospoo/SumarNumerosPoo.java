/*
 * Ejercicio simple de sumas inventado por mí.
 */
package sumarnumerospoo;

/**
 *
 * @author ANtonio
 */
public class SumarNumerosPoo {
    
    //Atributos
    public int sumando1;
    public int sumando2;
    
    
    //C0nstructores 
    public SumarNumerosPoo(){
        sumando1 = 1; 
        sumando2 = 2;
          
    }
    
    //Metodos
    public void setTresNumeros(int unNumero1, int unNumero2){
        sumando1 = unNumero1; 
        sumando2 = unNumero2;
       
    }
    public int getSuma(){
        return sumando1 + sumando2 ;
    }
}
