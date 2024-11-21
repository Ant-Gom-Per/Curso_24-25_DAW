import java.util.Scanner;
public class OrdenarDescendent{
    //variable global
    private int[] llistaEnters = new int[10];

    //mòduls del programa (mètodes)
    public static void main(String[] args){
        OrdenarDescendent programa = new OrdenarDescendent();
        programa.inici();
    }

    //NIVELL 0 DE DESCOMPOSICIÓ
    public void inici(){
        //Instruccions del problema general, que utilitzarà els de nivell inferior.
        llegirLlista();
        ordenarLlista();
        mostrarLlista();
        
    }

    //NIVELL 1: MÈTODE QUE S'ENCARREGA DE LLEGIR LES DADES DE LA LLISTA
    public void llegirLlista(){
        Scanner teclat = new Scanner(System.in);
        for(int i=0; i<llistaEnters.length; i++){
            System.out.print("Introdueix el valor " + (i+1) + ": ");
            //podriem dissenyar un subprograma per a llegir enters validant-los...
            llistaEnters[i] = teclat.nextInt();
            teclat.nextLine();
        }
        teclat.close();
    }

    //NIVELL 1: MÈTODE QUE S'ENCARREGA D'ORDENAR LA LLISTA
    public void ordenarLlista(){
        for(int i=0; i<llistaEnters.length - 1; i++){
            for(int j=i+1; j<llistaEnters.length; j++){
                if(llistaEnters[i] < llistaEnters[j]){
                    //podriem dissenyar un subprograma per a fer un intercanvi (swap)
                    int canvi = llistaEnters[i];
                    llistaEnters[i] = llistaEnters[j];
                    llistaEnters[j] = canvi;
                }
            }
        }
    }

    //NIVELL 1: MÈTODE QUE S'ENCARREGA DE MOSTRAR LA LLISTA PER PANTALLA
    public void mostrarLlista(){
        for(int enter: llistaEnters){
            System.out.print(enter + " ");
        }
        System.out.println();
    }
    

}