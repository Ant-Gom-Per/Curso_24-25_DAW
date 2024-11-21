import java.util.Scanner;
public class OrdenarDescendent3{
    //variable global
    private int[] llistaEnters = null;
    private int maxim;
    private int mida;
    private int quantitat = 0;

    //mòduls del programa (mètodes)
    public static void main(String[] args){
        OrdenarDescendent3 programa = new OrdenarDescendent3();
        programa.inici();
    }

    //NIVELL 0 DE DESCOMPOSICIÓ
    public void inici(){
        //Instruccions del problema general, que utilitzarà els de nivell inferior.
        llegirMida();
        crearLlista();
        llegirLlista();
        ordenarLlista();
        mostrarLlista();
        mostrarValorsInferiors();
    }

    // NIVELL 1: Llegir mida
    public void llegirMida(){
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix la mida de la llista: ");
        mida = teclat.nextInt();
        teclat.nextLine();
        teclat.close();
    }

    public void crearLlista(){
        llistaEnters = new int[mida];
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
    
    //NIVELL 1: MÈTODE QUE S'ENCARREGA DE MOSTRAR QUANTS VALORS SON INFERIORS
    // A LA MEITAT DEL VALOR MÉS GRAN EMMAGATZEMAT.
    public void mostrarValorsInferiors(){
        obtindreMaxim();
        obtindreInferiorsMeitat();
        System.out.println("Hi ha " + quantitat + " valors inferiors a la meitat de " + maxim);
    }

    //NIVELL 2: MÈTODE QUE OBTÉ EL VALOR MÀXIM DE LA LLISTA
    public void obtindreMaxim(){
        maxim = llistaEnters[0];
        for(int enter: llistaEnters){
            if(enter > maxim){
                maxim = enter;
            }
        }
    }
    //NIVELL 2: MÈTODE QUE OBTÉ LA QUANTITAT D'ELEMENTS INRERIORS A LA MEITAT DEL MÀXIM
    public void obtindreInferiorsMeitat(){
        for(int enter: llistaEnters){
            if(enter < maxim/2){
                quantitat++;
            }
        }
    }
}