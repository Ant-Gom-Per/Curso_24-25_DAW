public class UT33_ej2b {
    public static void main(String[] args) {
        final int QUANTITAT_FILES = 8;
        final int QUANTITAT_COLUMNES = 6;

        int matriu[][] = new int[QUANTITAT_FILES][QUANTITAT_COLUMNES];

        // GUARDEM 1s EN EL MARC DE LA MATRIU
        for(int i=0; i<matriu.length; i++){
            matriu[i][0] = 1;
            matriu[i][matriu[0].length - 1] = 1;
        }
        
        for(int i = 0; i < matriu[0].length; i++){
            matriu[0][i] = 1;
            matriu[matriu.length-1][i] = 1;
        }

        // FORMA ALTERNATIVA PER A IMPRIMIR UNA MATRIU


        for(int[] fila: matriu){
            for(int dada: fila){
                System.out.print(dada + "\t");
            }
            System.out.println();
        }


        /* 
        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[i].length; j++){
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }
        */
    }
}
