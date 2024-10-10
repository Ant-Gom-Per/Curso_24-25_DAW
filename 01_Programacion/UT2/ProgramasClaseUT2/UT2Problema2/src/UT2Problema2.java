/*
Por: Antonio Gómez Pérez
Este programa nos indica nuestro indice de masa corporal según el IMC de Oxford.
 */
import java.util.Scanner;

public class UT2Problema2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double peso, altura, alturaFormula, imcOxford, imcEstandar, diferencia;
        String resultadoImc = "";
        String diferenciaImc = "";
        
        System.out.println("Calculadora del Imc");
        System.out.println("-------------------");
        System.out.print("Introduce tu peso en Kg: ");
        peso = teclado.nextDouble();
        teclado.nextLine();
        if(peso <= 0){
            System.out.println("ERROR!!, el dato de peso no es válido.");
        }else{
            System.out.print("Introduce tu altura en cm: ");
                altura = teclado.nextDouble();
                teclado.nextLine();        
            if(altura <= 0){
                System.out.println("ERROR!!, el dato de altura no es válido");            
            }else{ 
                
                alturaFormula = Math.pow(altura / 100,2.5);
                imcOxford = (1.3 * peso) / alturaFormula;
                
                if(imcOxford < 18.5){
                    resultadoImc = "Falta de peso";
                }else if(imcOxford >= 18.5 && imcOxford < 25){
                    resultadoImc = "Normal";
                }else if(imcOxford >= 25 && imcOxford < 30){
                    resultadoImc = "Sobrepeso";
                }else{
                    resultadoImc = "Obeso";
                }
                
                alturaFormula = Math.pow(altura / 100,2);
                imcEstandar = peso / alturaFormula;                
                diferencia = imcEstandar - imcOxford;
                
                if(diferencia > 1){
                    diferenciaImc = " descompensado";
                }else{
                    diferenciaImc = "";
                }
                System.out.printf("\nTu indice IMC (Oxford 2003) es %.2f ",imcOxford);
                System.out.println("(" + resultadoImc + diferenciaImc + ")");
            }
        }        
    }    
}
