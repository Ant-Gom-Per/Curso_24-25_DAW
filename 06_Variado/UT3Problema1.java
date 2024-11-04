package ut3problema1;

import java.util.Scanner;

/**
 *
 * @author Rubén Gómez Tenza
 */
public class UT3Problema1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creamos las variables
        int i = 0, pos = 0, opcion;
        double sist, diast;
        double[] sistolica = new double[10];
        double[] diastolica = new double[10];

        System.out.println("TENSIÓN ARTERIAL");
        System.out.println("----------------");

        //Comprobamos que los valores sean correctos, y lo seguimos haciendo hasta salir o llenar los arrays(que i sea 10)
        System.out.print("Introduce las medidas: ");
        while (i < 10) {
            boolean error = false;
            if (!scanner.hasNextDouble() && !scanner.hasNextInt()) {
                error = true;
                scanner.next();
            }
            if ((sist = scanner.nextDouble()) < 3 || sist > 22) {
                if (sist == 0 && i >= 2) {
                    break;
                }
                error = true;
            }
            if (!scanner.hasNextDouble() && !scanner.hasNextInt()) {
                error = true;
                scanner.next();
            }
            if ((diast = scanner.nextDouble()) < 3 || diast > 22) {
                if (diast == 0 && i >= 2) {
                    break;
                }
                error = true;
            }
            if (sist < diast) {
                error = true;
            }
            //Si no ha ocurrido ningún error guardamos los datos
            if (!error) {
                sistolica[i] = sist;
                diastolica[i] = diast;
                i++;
            }
        }

        System.out.println("\n1.- Sistólica máxima");
        System.out.println("2.- Diastólica mínima");
        System.out.println("3.- Más compensada");
        System.out.println("4.- Tensión media");
        System.out.println("5.- Salir");

        //Comprobamos que sea válido y calculamos según que opción nos pida
        do {
            System.out.print("\nSelecciona la opción deseada: ");
            while (!scanner.hasNextInt() || (opcion = scanner.nextInt()) < 1 || opcion > 5) {
                System.out.println("Error");
                System.out.print("\nSelecciona la opción deseada: ");
            }
            //Salimos cuando la opción sea 5
            if (opcion == 5) {
                break;
            }

            switch (opcion) {
                case 1:
                    double sistMax = 3;
                    for (int j = 0; j < 10; j++) {
                        if (sistolica[j] > sistMax) {
                            sistMax = sistolica[j];
                            pos = j;
                        }
                    }
                    System.out.print(sistMax + " " + diastolica[pos]);
                    break;
                case 2:
                    double diastMin = 22;
                    for (int j = 0; j < 10; j++) {
                        if (diastolica[j] < diastMin && diastolica[j] >= 3) {
                            diastMin = diastolica[j];
                            pos = j;
                        }
                    }
                    System.out.print(sistolica[pos] + " " + diastMin);
                    break;
                case 3:
                    double diferencia = 22;
                    for (int j = 0; j < 10; j++) {
                        if (sistolica[j] >= 3 && Math.abs(sistolica[j] - (2 * diastolica[j])) < diferencia) {
                            pos = j;
                            diferencia = (sistolica[j] - (2 * diastolica[j]));
                        }
                    }
                    System.out.print(sistolica[pos] + " " + diastolica[pos]);
                    break;
                case 4:
                    double sumaSist = 0;
                    double mediaSist;
                    double sumaDiast = 0;
                    double mediaDiast;
                    for (int j = 0; j < 10; j++) {
                        sumaSist += sistolica[j];
                    }
                    for (int j = 0; j < 10; j++) {
                        sumaDiast += diastolica[j];
                    }
                    mediaSist = sumaSist / i;
                    mediaDiast = sumaDiast / i;
                    System.out.printf("%.2f %.2f\n", mediaSist, mediaDiast);
                    break;
            }
            //No lo calculamos ni mostramos si elije la opción 4
            if (opcion != 4) {
                String tipoPresion;
                if (sistolica[pos] < 12 && diastolica[pos] < 8) {
                    tipoPresion = " Óptima";
                } else if (sistolica[pos] >= 12 && sistolica[pos] < 13 && diastolica[pos] >= 8 && diastolica[pos] < 8.5) {
                    tipoPresion = " Normal";
                } else if (sistolica[pos] >= 13 && sistolica[pos] < 14 && diastolica[pos] >= 8.5 && diastolica[pos] < 9) {
                    tipoPresion = " Normal - Alta";
                } else if (sistolica[pos] >= 14 && sistolica[pos] < 16 && diastolica[pos] >= 9 && diastolica[pos] < 10) {
                    tipoPresion = " Grado 1";
                } else if (sistolica[pos] >= 16 && sistolica[pos] < 18 && diastolica[pos] >= 10 && diastolica[pos] < 11) {
                    tipoPresion = " Grado 2";
                } else if (sistolica[pos] >= 18 && diastolica[pos] >= 11) {
                    tipoPresion = " Grado 3";
                } else if (sistolica[pos] >= 14 && diastolica[pos] < 9) {
                    tipoPresion = " Sistolica Aislada";
                } else {
                    tipoPresion = " No contemplada";
                }
                System.out.println(tipoPresion);
            }

        } while (opcion != 5);
        System.out.println("FIN DEL PROGRAMA");
    }
}
