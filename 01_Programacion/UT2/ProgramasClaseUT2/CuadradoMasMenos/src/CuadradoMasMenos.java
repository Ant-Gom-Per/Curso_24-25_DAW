/*
Ejercicio 1 UT
 */

/**
 *
 * @author ciclost
 */
public class CuadradoMasMenos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int altura = 8;
        for (int i=0 ; i<altura ; i++){
          for(int j=0 ; j<altura ; j++){
                if((i+j)%2 == 0){
                System.out.print("+");
            }else{
                System.out.print("-");
            }
          }
            System.out.println("");
        }
    }
    
}
