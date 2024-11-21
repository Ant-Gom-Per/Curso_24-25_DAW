

public class Practica13{

    
    public static void main(String[] args){
        Practica13 programa = new Practica13();
        programa.inicio();
    }

    public void inicio(){

        double[] notas = {3.1, 9, 4.7, 5, 8};
        double nota;

        // PRUEBA METODO OBTENER MÁXIMO
        double maximo = obtenerMaximo(notas);
        System.out.println("La nota máxima es: "+maximo);

        // PRUEBA METODO MEDIA ARITMETICA
        System.out.printf("La media aritmética de las notas es %.2f\n",mediaAritmetica(notas));

        // PRUEBA METODO NOTA A TEXTO
        System.out.println("La primera nota es un " + notas[0] + " es decir un " + notaATexto(notas[0]));

        // PRUEBA DIAS DE MES
        System.out.println("Febrero tiene un total de "+diasMes(2)+" días");

        // PRUEBA BUSCAR ELEMENTO EN ARRAY
        nota = 4.3;
        System.out.println("La nota " + nota + " existe? "+existeNota(notas, nota));

    }
   
    public double obtenerMaximo(double[] vector){
        double maximo = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(vector[i] > maximo){
                maximo = vector[i];
            }
        }
        return maximo;
    }

    public double mediaAritmetica(double[] vector){
        double total = 0;
        for(int i = 0; i < vector.length; i++){
            total += vector[i];
        }
        return (total / vector.length);
    }

    public String notaATexto(double nota){
        if(nota < 5){
            return "suspenso";
        }
        else{
            return "aprobado";
        }
    }

    public int diasMes(int mes){
        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return -1;
        }
    }

    public boolean existeNota(double[] notas, double nota){
        for(int i=0; i<notas.length;i++){
            if(notas[i] == nota) return true;
        }
        return false;
    }

}