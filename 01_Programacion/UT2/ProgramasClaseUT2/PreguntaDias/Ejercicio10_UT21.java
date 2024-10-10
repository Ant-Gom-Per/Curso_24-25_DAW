import java.util.Scanner;
public class Ejercicio10_UT21{
	public static void main (String[] args) {

		Scanner teclat = new Scanner(System.in);
		int dia, mes, any;

		System.out.print("Introdueix el dia: ");
		dia = teclat.nextInt();
		teclat.nextLine();
		System.out.print("Introdueix el mes: ");
		mes = teclat.nextInt();
		teclat.nextLine();
		System.out.print("Introdueix l'any: ");
		any = teclat.nextInt();
		teclat.nextLine();
		teclat.close();

		 //PRIMER COMPROVEM QUE L'ANY SIGA CORRECTE

		if(any == 0){
			System.out.println("ERROR: ANY INEXISTENT");
		}

		// SI ES CORRECTE L'ANY, COMPROVEM QUE SIGA CORRECTE EL MES DE FEBRER
		else if(mes == 2 && (dia>=1 && dia<=28)){
			System.out.println("DATA CORRECTA: "+dia+"-"+mes+"-"+any);
		}

		// SI NO ES FEBRER COMPROVEM ELS MESOS DE 30 DIES

		else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia>=1 && dia<=30)){
			System.out.println("DATA CORRECTA: "+dia+"-"+mes+"-"+any);
		}

		// SI NO, COMPROVEM ELS MESOS DE 31 DIES

		else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia>=1 && dia<=31)){
			System.out.println("DATA CORRECTA: "+dia+"-"+mes+"-"+any);
		}

		// EN ALTRE CAS SERÀ INCORRECTA

		else{
			System.out.println("DATA INCORRECTA");
		}

	}
}