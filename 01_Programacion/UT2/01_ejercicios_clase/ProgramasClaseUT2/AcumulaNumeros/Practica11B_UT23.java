// Este bucle realizamenos pasos para determinar elresultado

import java.util.Scanner;
public class Practica11B_UT23{
	public static void main (String[] args) {

		Scanner teclado = new Scanner(System.in);
		int i = 0, acumulador = 0, maximo;

		System.out.print("Introduce el valor máximo a comprobar: ");

		if(teclado.hasNextInt() && (maximo = teclado.nextInt()) >= 0){
			teclado.nextLine();
			while(i <= maximo){
				acumulador += i;
				i+=3;
			}
			System.out.println("La suma de los múltiplos de 3 desde el 0 hasta el "+maximo+" es: "+acumulador);
		}
		else{
			System.out.println("ERROR: Valor inválido.");
		}
	}
}
