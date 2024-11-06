import java.util.Scanner;

public class EjercicioUT31_5 {
    
    
    public static void main(String[] args) {
        final int QUANTITAT_ALUMNES = 5;
        double[] primerTrimestre = new double[QUANTITAT_ALUMNES];
        double[] segonTrimestre = new double[QUANTITAT_ALUMNES];
        double[] tercerTrimestre = new double[QUANTITAT_ALUMNES];
        double sumaPrimerTrimestre = 0.0, sumasegonTrimestre = 0.0, sumaTercerTrimestre = 0.0, notaMitjana;
        int alumne = 0;
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("PRIMER TRIMESTRE:");
        for(int i=0; i<QUANTITAT_ALUMNES; i++){
            System.out.print("Introdueix la nota de l'alumne "+(i+1)+": ");
            while (!teclat.hasNextDouble() || (primerTrimestre[i] = teclat.nextDouble()) <0 || primerTrimestre[i] >10) {
                teclat.nextLine();
                System.out.print("ERROR. Introdueix la nota de l'alumne "+(i+1)+": ");
            }
            sumaPrimerTrimestre += primerTrimestre[i];
            teclat.nextLine();
        }
        
        System.out.println("SEGON TRIMESTRE:");
        for(int i=0; i<QUANTITAT_ALUMNES; i++){
            System.out.print("Introdueix la nota de l'alumne "+(i+1)+": ");
            while (!teclat.hasNextDouble() || (segonTrimestre[i] = teclat.nextDouble()) <0 || segonTrimestre[i] >10) {
                teclat.nextLine();
                System.out.print("ERROR. Introdueix la nota de l'alumne "+(i+1)+": ");
            }
            sumasegonTrimestre += segonTrimestre[i];
            teclat.nextLine();
        }
        
        System.out.println("TERCER TRIMESTRE:");
        for(int i=0; i<QUANTITAT_ALUMNES; i++){
            System.out.print("Introdueix la nota de l'alumne "+(i+1)+": ");
            while (!teclat.hasNextDouble() || (tercerTrimestre[i] = teclat.nextDouble()) <0 || tercerTrimestre[i] >10){
                teclat.nextLine();
                System.out.print("ERROR. Introdueix la nota de l'alumne "+(i+1)+": ");
            }
            sumaTercerTrimestre += tercerTrimestre[i];
            teclat.nextLine();
        }
        teclat.close();
        
        System.out.printf("\nLa mitjana del primer trimestre es: %.2f",(sumaPrimerTrimestre/QUANTITAT_ALUMNES));
        System.out.printf("\nLa mitjana del segon trimestre es: %.2f",(sumasegonTrimestre/QUANTITAT_ALUMNES));
        System.out.printf("\nLa mitjana del tercer trimestre es: %.2f",(sumaTercerTrimestre/QUANTITAT_ALUMNES));
        
        System.out.print("\nIntrodueix l'alumne del qual vols coneixer la seua nota mitjana (1 al 5): ");
        while (!teclat.hasNextInt() || (alumne = teclat.nextInt()) < 1 || alumne > QUANTITAT_ALUMNES) {
            teclat.nextLine();
            System.out.print("ERROR. Introdueix l'alumne del qual vols coneixer la seua nota mitjana (1 al 5): (1 al 5):");
        }
        
        teclat.nextLine();
        notaMitjana = (primerTrimestre[alumne-1] + segonTrimestre[alumne-1] + tercerTrimestre[alumne-1]) / 3;
        System.out.printf("\nLa nota mitjana de l'alumne %d es %.2f\n",alumne,notaMitjana);
    }
}