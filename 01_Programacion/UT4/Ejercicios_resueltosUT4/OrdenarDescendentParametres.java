import java.util.Scanner;
public class OrdenarDescendentParametres{

    //mòduls del programa (mètodes)
    public static void main(String[] args){
        OrdenarDescendentParametres programa = new OrdenarDescendentParametres();
        programa.inici();
    }

    //NIVELL 0 DE DESCOMPOSICIÓ
    public void inici(){
        int[] llistaEnters = new int[10];
        //Instruccions del problema general, que utilitzarà els de nivell inferior.
        llegirLlista(llistaEnters);
        ordenarLlista(llistaEnters);
        mostrarLlista(llistaEnters);
        mostrarValorsInferiors(llistaEnters);
    }

    //NIVELL 1: MÈTODE QUE S'ENCARREGA DE LLEGIR LES DADES DE LA LLISTA
    public void llegirLlista(int[] llistaEnters){
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
    public void ordenarLlista(int[] llistaEnters){
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
    public void mostrarLlista(int[] llistaEnters){
        for(int enter: llistaEnters){
            System.out.print(enter + " ");
        }
        System.out.println();
    }
    
    //NIVELL 1: MÈTODE QUE S'ENCARREGA DE MOSTRAR QUANTS VALORS SON INFERIORS
    // A LA MEITAT DEL VALOR MÉS GRAN EMMAGATZEMAT.
    public void mostrarValorsInferiors(int[] llistaEnters){

        System.out.println("Hi ha " + obtindreInferiorsMeitat(llistaEnters) + " valors inferiors a la meitat de " + obtindreMaxim(llistaEnters));
    }

    //NIVELL 2: MÈTODE QUE OBTÉ EL VALOR MÀXIM DE LA LLISTA
    public int obtindreMaxim(int[] llistaEnters){
        int maxim = llistaEnters[0];
        for(int enter: llistaEnters){
            if(enter > maxim){
                maxim = enter;
            }
        }
        return maxim;
        /* En realitat l'array ja està ordenat, seria suficient amb:
        return llistaEnters[0]; */
    }
    //NIVELL 2: MÈTODE QUE OBTÉ LA QUANTITAT D'ELEMENTS INRERIORS A LA MEITAT DEL MÀXIM
    public int obtindreInferiorsMeitat(int[] llistaEnters){
        int quantitat = 0;
        for(int enter: llistaEnters){
            if(enter < obtindreMaxim(llistaEnters)/2){
                quantitat++;
            }
        }
        return quantitat;
    }
}