/*
Autor: Antonio Gómez Pérez
Este programa nos permite calcular el área y el perímetro de diferentes formas geométricas.
 */
import java.util.Scanner;

public class UT1Problema1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        final double PI = 3.1416;
        int radioCirculo, alturaRectangulo, cateto1, cateto2;
        double  baseRectangulo, perimetroCirculo, areaCirculo, areaRectangulo, hipotenusa, hipotAlCuadrado, alturaCilindro, volumenCilindro;
        
        System.out.print("Dime el valor del radio de un círculo: ");
        radioCirculo = teclado.nextInt();
        teclado.nextLine();
        System.out.print("\nAhora dime el valor de la base de un rectángulo: ");
        baseRectangulo = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("\nY no olvides decirme la altura del rectángulo: ");
        alturaRectangulo = teclado.nextInt();
        teclado.nextLine();
        perimetroCirculo = PI * (radioCirculo*2);
        areaCirculo =  PI * (radioCirculo * radioCirculo);
        areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.printf("\nDe momento tenemos un circulo de perimetro %.2f y área %.2f y un rectángulo de área %.2f\n", perimetroCirculo, areaCirculo, areaRectangulo);
        System.out.print("\nMe gusta el teorema de Pitágoras, dime el valor del cateto 1: ");
        cateto1 = teclado.nextInt();
        teclado.nextLine();
        System.out.print("\nDime ahora el valor del cateto 2: ");
        cateto2 = teclado.nextInt();
        teclado.nextLine();
        hipotAlCuadrado = (cateto1 * cateto1) + (cateto2 * cateto2);
        hipotenusa = Math.sqrt(hipotAlCuadrado);
        System.out.printf("\nDe acuerdo, el valor de la hipotenusa al cuadrado es de %.2f y por lo tanto el valor de la hipotenusa es de %.2f\n", hipotAlCuadrado, hipotenusa);
        System.out.print("\nVamos a convertir el circulo de antes en un cilindro, dime que altura tiene: ");
        alturaCilindro = teclado.nextDouble();
        teclado.nextLine();
        volumenCilindro = PI * (radioCirculo *radioCirculo) * alturaCilindro;
        System.out.printf("\nEl cilindro que hemos creado tiene de volumen %.2f\n\n", volumenCilindro);
    }
    
}
