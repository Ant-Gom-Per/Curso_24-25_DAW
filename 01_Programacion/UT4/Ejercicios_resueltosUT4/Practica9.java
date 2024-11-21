public class Practica9{

    
    public static void main(String[] args){
        Practica9 programa = new Practica9();
        programa.inici();
    }

    public void inici(){
        int auxiliar = 3;
        imprimirAsteriscos(4);
        imprimirAsteriscos(1  + 5 + auxiliar);
    }
   
    public void imprimirAsteriscos(int numeroAsteriscos){
        for(int i=0; i<numeroAsteriscos; i++){
            System.out.print("*");
        }
        System.out.println();
    }

}