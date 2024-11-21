public class FactorialRecursiu{

    
    public static void main(String[] args){
        FactorialRecursiu programa = new FactorialRecursiu();
        programa.inici();
    }

    public void inici(){
        int f = factorial(5);
        System.out.println(f);
    }
   
   public int factorial(int numero){
       if(numero == 1){
           return 1;
       }
       else{
           return numero*factorial(numero-1);
       }
   }

}