public class FactorialIteratiu{

    
    public static void main(String[] args){
        FactorialIteratiu programa = new FactorialIteratiu();
        programa.inici();
    }

    public void inici(){
        System.out.println(factorial(4));
    }
   
   public int factorial(int numero){
       int resultat = 1;
       for(int i=numero; i>1; i--){
           resultat *= i;
       }
       return resultat;
   }

}