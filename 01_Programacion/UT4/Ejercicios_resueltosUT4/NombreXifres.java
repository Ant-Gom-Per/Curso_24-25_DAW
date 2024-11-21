public class NombreXifres{

    
    public static void main(String[] args){
        NombreXifres programa = new NombreXifres();
        programa.inici();
    }

    public void inici(){
        System.out.println(nombreXifres(-545));
    }

    public int nombreXifres(int n){
        n = Math.abs(n);
        if(n < 10) return 1;
        else return 1 + nombreXifres(n/10);
    }
 
   
    
}