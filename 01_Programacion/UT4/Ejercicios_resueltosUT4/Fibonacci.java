public class Fibonacci {
    public static void main(String[] args){
        Fibonacci programa = new Fibonacci();
        programa.inici();
    }

    public void inici(){
        //PROVEM QUE FUNCIONA EL MÈTODE unFibonacci
        //System.out.println(unFibonacci(4));
        serieFibonacci(7);
    }

    // Este mètode obté només un número de fibonacci, el de la posició que li indiquem.
    public int unFibonacci(int pos){
        if(pos==0 || pos==1){
            return pos;
        }
        else{
            return unFibonacci(pos-1) + unFibonacci(pos-2);
        }
    }

    // Este mètode imprimeix la quantitat de números fibonacci que vulguem (una sèrie de tants números com vulguem)
    // ÉS UNA MICA MÉS COMPLICAT, ES POT FER DE MANERA ITERATIVA COM ES MOSTRA LA LÍNIA 35
    public void serieFibonacci(int quantitat){
        if(quantitat==1){
            System.out.print(unFibonacci(quantitat-1));
        }
        else{
            serieFibonacci(quantitat-1);
            System.out.print(", "+unFibonacci(quantitat-1));
        }
    }
    /* El mateix mètode de manera iterativa
    public void serieFibonacci(int quantitat){
        for(int i=0; i<quantitat; i++){
            System.out.print(unFibonacci(i)+",");
        }
        System.out.print("...");
    }
    */
}
