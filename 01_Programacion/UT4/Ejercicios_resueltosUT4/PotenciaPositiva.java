

public class PotenciaPositiva{

    
    public static void main(String[] args){
        PotenciaPositiva programa = new PotenciaPositiva();
        programa.inicio();
    }

    public void inicio(){
       System.out.println(potencia(-2,3));
    }
   
   public int potencia (int base, int exponent){
       if(exponent == 0){
           return 1;
       }
       else{
           return base * potencia(base, exponent-1);
       }

   }

}