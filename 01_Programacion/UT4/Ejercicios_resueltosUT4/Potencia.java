

public class Potencia{

    
    public static void main(String[] args){
        Potencia programa = new Potencia();
        programa.inici();
    }

    public void inici(){
       System.out.println(potencia(10,-2));
    }
   
   public double potencia (double base, double exponent){
       if(exponent == 0){
           return 1;
       }
       else if(exponent < 0){
           return potencia(base,exponent+1) / base;
       }
       else{
           return base * potencia(base,exponent-1);
       }

   }

}