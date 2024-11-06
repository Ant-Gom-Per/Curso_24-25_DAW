import java.util.Scanner;

public class UT31_PR31 {


    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int quantitatNotes;
        double[] notes;
        
        System.out.print("Introdueix quantes notes vols llegir: ");

        while(!teclat.hasNextInt() || (quantitatNotes = teclat.nextInt()) < 0){
            teclat.nextLine();
            System.out.print("ERROR. Introdueix quantes notes vols llegir: ");
        }

        teclat.nextLine();
        notes = new double[quantitatNotes];
        

        for(int i=0; i<notes.length; i++){
            System.out.print("Introdueix la nota " + (i+1) + ": ");
            while (!teclat.hasNextDouble() || (notes[i] = teclat.nextDouble()) < 0 || notes[i] > 10)  {
                teclat.nextLine();
                System.out.print("ERROR. Introdueix la nota " + (i+1) + ": ");
            }
            teclat.nextLine();
        }
   
        for(int i = 0; i<notes.length; i++){
            System.out.println("Nota "+(i+1)+": "+notes[i]);
        }

        teclat.close();
    }
}
