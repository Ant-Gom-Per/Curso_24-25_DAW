public class chino {
    public static void main(String[] args){
    
        int a,b,c;

            a = 1702;
            b = 100;
            c = a % b;
            System.out.println("Resultado c: "+ c);
            if(c < 12){
                c += 4;
            }
            while(c > 11){
                c -= 12;          
            }  
            System.out.println("Resultado c: "+ c);
    }
}
