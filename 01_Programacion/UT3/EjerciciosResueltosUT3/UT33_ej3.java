public class UT33_ej3 {
    
    public static void main(String[] args) {
        final int kFILES = 4;
        final int kCOLUMNES = 5;
        int taula1[][]=new int[kFILES][kCOLUMNES];
        int taula2[][]=new int[kFILES][kCOLUMNES];
        int taulaSuma[][]=new int[kFILES][kCOLUMNES];

        //GENEREM ELS VALORS ALEATORIS PER A CADA CEL·LA DE LES MATRIUS
        for (int i=0;i<kFILES;i++){
            for (int j=0;j<kCOLUMNES;j++){
                taula1[i][j]= (int) (Math.random() * 10);
                taula2[i][j]= (int) (Math.random() * 10);
            }
        }

        // Rebem les dos taules emplenades i les sumem.
        System.out.println("--------------------------------------------------------");
        for (int i=0;i<kFILES;i++){
            for (int j=0;j<kCOLUMNES;j++){
                taulaSuma[i][j]= taula1[i][j] + taula2[i][j];
            }
        }

        //Imprimim les tres matrius
        for (int i=0;i<kFILES;i++){
            for (int j=0;j<kCOLUMNES;j++){
                System.out.print(taula1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int i=0;i<kFILES;i++){
            for (int j=0;j<kCOLUMNES;j++){
                System.out.print(taula2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int i=0;i<kFILES;i++){
            for (int j=0;j<kCOLUMNES;j++){
                System.out.print(taulaSuma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
