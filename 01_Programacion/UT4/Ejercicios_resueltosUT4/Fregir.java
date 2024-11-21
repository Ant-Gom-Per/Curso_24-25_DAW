import java.util.Scanner;

public class Fregir {
    private  Scanner teclat = new Scanner(System.in);
    public static void main(String[] args) {
        Fregir programa = new Fregir();
        programa.inici();
    }

    public void inici(){
        double valor1 = llegirRealTeclat();
        double valor2 = llegirRealTeclat();
        System.out.println(valor1 + valor2);
    }
    public double llegirRealTeclat(){
  
        double valid;
        System.out.print("Introdueix un real: ");
        while(!teclat.hasNextDouble() || (valid = teclat.nextDouble()) < 0){
            teclat.nextLine();
            System.out.print("ERROR. Introdueix un real: ");
        }
        teclat.nextLine();
        return valid;
    }

    public void imprimirRecepta(String aliment){
        System.out.println("FREGIR " + aliment.toUpperCase());
        System.out.println("Preparar la paella per a fregir");
        System.out.println("Agafar els/les " + aliment.toLowerCase());
        System.out.println("Rossejar els/les " + aliment.toLowerCase());
        System.out.println("Treure els/les " + aliment + " de la paella");
        System.out.println("Deixar els/les " + aliment + "en un plat");
        System.out.println("Netejar la paella");
    }

    public void imprimirAsteriscs(int quantitatAsteriscs){
        for (int i = 0; i < quantitatAsteriscs; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public String modificarParametre(String copia){
        // copia = original
        copia = "ADÉU";
        copia = "ALTRA";
        return copia;
    }
}
