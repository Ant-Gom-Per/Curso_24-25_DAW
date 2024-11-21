public class FactorialRecursiu2{

    
    public static void main(String[] args){
        FactorialRecursiu2 programa = new FactorialRecursiu2();
        programa.inici();
    }

    public void inici(){
        System.out.println(factorial(-5));
    }
   
   public int factorial(int numero){
       if(numero == 0 || numero == 1){
           return 1;
       }
       else if(numero == -1){
           return -1;
       }
       else if(numero < 0){
            return numero*factorial(numero+1);
       }
       else{
           return numero*factorial(numero-1);
       }
   }

}