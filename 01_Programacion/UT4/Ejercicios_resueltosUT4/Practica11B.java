public class Practica11B{

    
    public static void main(String[] args){
        Practica11B programa = new Practica11B();
        programa.inici();
    }

    public void inici(){
        StringBuffer original = new StringBuffer("Frase original");
        System.out.println("String original: "+original);
        modificarParametre(original);
        System.out.println("String final: "+original);
    }
   
    public void modificarParametre(StringBuffer frase){
        frase = frase.replace(0, frase.length(), "Frase modificada!");
        System.out.println("EL MÈTODE POSA L'STRING A: "+frase);
    }

}