public class Practica11{

    
    public static void main(String[] args){
        Practica11 programa = new Practica11();
        programa.inici();
    }

    public void inici(){
        String original = "Frase original";
        System.out.println("String original: " + original);
        modificarParametre(original);
        System.out.println("String final: " + original);
    }
   
    public void modificarParametre(String frase){
        frase = "Frase modificada";
        System.out.println("EL MÈTODE POSA L'STRING A: " + frase);
    }

}