/*
Ejemplo 1/5
 */
public class Ejemplo1_Pag31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejemplo1_Pag31 programa = new Ejemplo1_Pag31();
        programa.inicio();
    }
    
    public void inicio(){
        int[]elementos = {1, 2, 3, 4};
        maximo(elementos);
        System.out.println("maximo " + maximo(elementos));
        promedio(elementos);        
        System.out.println("promedio " + promedio(elementos));
    }
    
    public int maximo (int[] enteros){
        int numMax =0;
        for (int i = 0; i < enteros.length; i++) {
            if(numMax < enteros[i]){
                numMax = enteros[i];
            }
        }
        return numMax;
    }
    
    public int promedio (int[] enteros){
        int media = 0;
        for (int i = 0; i < enteros.length; i++) {
            media += enteros[i];
        }
        media = media/enteros.length;
        return media;
    }
}
