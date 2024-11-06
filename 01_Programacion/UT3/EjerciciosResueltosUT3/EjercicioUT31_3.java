public class EjercicioUT31_3 {


    public static void main(String[] args) {
        int[] vectorNumeros1 = {1,7,8,6,29,-2,3};
        int[] vectorNumeros2 = {1,7,8,6,29,-2,3};
        boolean iguals = true;

        if(vectorNumeros1.length == vectorNumeros2.length){
            for(int i = 0; i<vectorNumeros1.length && iguals; i++){
                if(vectorNumeros1[i] != vectorNumeros2[i]){
                    iguals = false;
                }
            }
        }
        else{
            iguals = false;
        }               

        if(iguals){
            System.out.println("SÓN iguals");
        }
        else{
            System.out.println("NO SÓN iguals");
        }
    }
}