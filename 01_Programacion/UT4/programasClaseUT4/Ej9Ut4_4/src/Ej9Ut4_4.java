/*
Ejercicio 9 Ut 4_4
 */
public class Ej9Ut4_4 {

    public static void main(String[] args) {
        Ej9Ut4_4 programa = new Ej9Ut4_4();
        programa.inicio();
        
    }
    
    public void inicio(){
        repetir(5);
        System.out.println("----------");
        repetir(10);
        System.out.println("----------");
        repetir(6+8);
        System.out.println("------------");
    }
    
    public void repetir(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.print("* ");
            
        }
        System.out.println(" ");
    }
    
}
