public class UT33_ej1 {
    
    public static void main(String[] args) {
        final int TAMANY= 10;
        int taula[][]=new int[TAMANY][TAMANY];
        int sumaColumnes[] = new int[TAMANY];
        int sumaFila = 0;
        
        taula = new int[TAMANY][TAMANY];
        for (int i=0;i<TAMANY;i++){
            for (int j=0;j<TAMANY;j++){
                taula[i][j]= (int) (Math.random() * 10);
                sumaFila += taula[i][j];
                sumaColumnes[j] += taula[i][j];

                System.out.print(taula[i][j] + "\t");
            }
            System.out.println(" | "+ sumaFila);
            sumaFila = 0;
        }
        System.out.println("--------------------------------------------------------");
        for(int i=0; i<sumaColumnes.length;i++){
            System.out.print(sumaColumnes[i] + "\t");
        }
        System.out.println();
    }
}
