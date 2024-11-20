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
        
        int nota = 3;
        calificacion(nota);
        System.out.println("calificacion: " + calificacion(nota));
        
        int numMes = 3;
        diasMes(numMes);
        System.out.println("DiasMes: " + diasMes(numMes));
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
    
    public String calificacion(int nota){
        String resultado = "";
        if (nota < 5) {
            resultado = "Suspenso";            
        }else{
           resultado = "Aprobado";
        }
        return resultado;
    }
    
    public int diasMes (int numMes){     
        int dia = 0;
        if(numMes == 4 || numMes == 6 || numMes == 9 || numMes == 11){
            dia = 30;
        }else if(numMes == 2){
            dia = 28;
        }else{
            dia = 31;
        }
        return dia;
    }
}
