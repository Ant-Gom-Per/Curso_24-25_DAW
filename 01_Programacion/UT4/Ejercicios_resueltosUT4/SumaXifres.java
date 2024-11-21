public class SumaXifres{

    
    public static void main(String[] args){
        SumaXifres programa = new SumaXifres();
        programa.inici();
    }

    public void inici(){
        System.out.println(sumarXifres(-3571));
    }

    public int sumarXifres(int n){
        n = Math.abs(n);
        if(n < 10) return n;
        else return sumarXifres(n/10) + n%10;
    }
 
   
    
}