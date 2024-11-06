public class UT33_ej1b {
    
    public static void main(String[] args) {
        final int TAMANY=4;
        int taula[][]=new int[TAMANY][TAMANY];
        int sumaFila, sumaColumna;

        for (int i=0;i<TAMANY;i++){
            sumaFila = 0;
            for (int j=0;j<TAMANY;j++){
                taula[i][j]= (int) (Math.random() * 10);
                sumaFila += taula[i][j];
                System.out.print(taula[i][j] + "\t");
            }
            System.out.println(" | "+ sumaFila);
            
        }
        System.out.println("--------------------------------------------------------");
        
        //Recorrem la matriu columna a columna en comptes de fila a fila.
        for(int i=0; i<taula.length;i++){
            sumaColumna = 0;
            for(int j=0;j<taula[i].length;j++){
                sumaColumna += taula[j][i];
            }
            System.out.print(sumaColumna + "\t");
        }
        System.out.println();
    }
}
