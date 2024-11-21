public class FactorialIteratiu2{

    
    public static void main(String[] args){
        FactorialIteratiu2 programa = new FactorialIteratiu2();
        programa.inici();
    }

    public void inici(){
        System.out.println(factorial(-3));
    }
   
   public int factorial(int numero){
    int resultat;   
    if(numero >= 0){
        resultat = 1;
        for(int i=numero; i>1; i--){
            resultat *= i;
        }
    }
    else{
        resultat = -1;
        for(int i=numero; i<-1; i++){
            resultat *=i;
        }
    }
       return resultat;
   }

}