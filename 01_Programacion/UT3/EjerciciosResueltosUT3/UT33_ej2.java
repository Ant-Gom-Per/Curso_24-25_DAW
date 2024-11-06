public class UT33_ej2 {
    
    public static void main(String[] args) {
        final int QUANTITAT_FILES = 8;
        final int QUANTITAT_COLUMNES = 6;

        int matriu[][] = new int[QUANTITAT_FILES][QUANTITAT_COLUMNES];

        // GUARDEM 1s EN EL MARC DE LA MATRIU
        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[i].length; j++){
                if(i == 0 || j == 0 || i == matriu.length - 1 || j == matriu[i].length - 1){
                    matriu[i][j] = 1;
                }
            }
        }



        // IMPRIMIM LA MATRIU
        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[i].length; j++){
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
