/*
Por: Antonio Gómez Pérez
 */

public class Ej3 {

    public static void main(String[] args) {
        double[][] matrizPetrer = {
            {25.3, 15.2},
            {24.4, 12.4},
            {21.4, 14.7},
            {23.3, 13.2},
            {25.1, 12.3},
            {20.7, 11.5},
            {23.2, 13.1},
   
        };
        
        double[][] matrizElda = {
            {20.3, 15.1},
            {25.4, 13.3},
            {22.4, 11.5},
            {26.3, 10.6},
            {21.1, 13.3},
            {24.7, 12.8},
            {27.2, 10.2},
   
        };
        double[][] matrizNovelda = {
            {21.3, 12.9},
            {20.5, 15.4},
            {23.4, 10.1},
            {24.7, 17.8},
            {27.3, 12.4},
            {22.7, 15.7},
            {21.1, 11.5},
   
        };
        double tempMax =0;
        double tempMin =70;
        
        for (int i = 0; i < matrizPetrer.length; i++) {
            for (int j = 0; j < matrizPetrer[i].length; j++) {
                if(tempMax < matrizPetrer[i][j]){
                    tempMax += matrizPetrer[i][j];
                }
                else if(tempMin > matrizPetrer[i][j]){
                    tempMin += matrizPetrer[i][j];
                }
            }
            
        }
      
        System.out.println("-------------------");
        System.out.println("tempMax " + tempMax);
        System.out.println("tempMin " + tempMin);
        
       
    }
    
}
