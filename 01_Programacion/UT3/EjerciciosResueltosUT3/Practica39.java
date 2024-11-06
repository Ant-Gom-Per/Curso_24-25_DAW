import java.util.Scanner;

public class Practica39 {

    public static void main(String[] args) {
        double maxima = 0.0;
        double media = 0.0;
        double mejorMedia = 0.0;
        double mejorMaxima = 0.0;
        int posicionMejorMedia = -1;
        int posicionaMejorMaxima = -1;

        String nombres[] = {"Espinete","Don Pinpon", "Gustavo", "Triki"};
        double[][] notas = {
                                {6.0, 7.2, 2.3, 5.8, 3.4},
                                {7.8, 1.6, 4.6, 9.4, 3.1},
                                {3.6, 1.4, 8.9, 3.5, 6.5},
                                {2.5, 3.0, 10, 2.4, 8.9}
                            };

        double[][] mediasYMaximas = new double[4][2];
        
        // Lo primero es calcular media y máxima de cada alumno y guardarlas en el array mediasYMaximas
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                media += notas[i][j];
                if(notas[i][j] >= maxima){
                    maxima = notas[i][j];
                }
            }
            mediasYMaximas[i][0] = media / notas[i].length;
            mediasYMaximas[i][1] = maxima;
            media = 0.0;
            maxima = 0.0;
        }

        // Vemos quien tiene la mejor nota media y maxima;
        for(int i=0; i<mediasYMaximas.length; i++){
            if(mediasYMaximas[i][0] >= mejorMedia){
                mejorMedia = mediasYMaximas[i][0];
                posicionMejorMedia = i;
            }

            if(mediasYMaximas[i][1] >= mejorMaxima){
                mejorMaxima = mediasYMaximas[i][1];
                posicionaMejorMaxima = i;
            }

        }

        System.out.println("El alumno con mejor media es "+nombres[posicionMejorMedia]+": "+mejorMedia);
        System.out.println("El alumno con mayor nota individual es "+nombres[posicionaMejorMaxima]+": "+mejorMaxima);

    }

}
