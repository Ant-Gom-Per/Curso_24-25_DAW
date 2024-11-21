import java.util.Scanner;
public class Practica5{
    private final int DIES_SETMANA = 7;
    private final int SETMANES_ANY = 52;
    private double temperatures[][] = new double[SETMANES_ANY][DIES_SETMANA];
    private int dia=1;
    private int mes=1;
    private int setmana = 0;
    private boolean eixida = false;
    private int opcio;
    public static void main(String[] args){
        Practica5 programa = new Practica5();
        programa.inici();
    }

    //NIVELL 0 de descomposició (arrel). Només existeix un mòdul a descomposar: inici
    public void inici(){
         for(int i=0; i<10; i++){
             mostrarDataActual();
             actualitzarData();
         }
    }

    //NIVELL 1
    //Tasca 1. Mostrar el menú
    public void mostrarMenu(){

    }

    //Tasca 2. Tractar l'ordre donada per l'usuari
    public void tractarOrdre(){
       
    }

    //NIVELL 2
    //Tasca 2.1 Introducció de temperatures setmanals.
    public void introduirTemperatures(){

    }


    //Tasca 2.2. Mostrar la temperatura mitjana de les que hi ha emmagatzemades
    public void mostrarTemperaturaMitjana(){

    }

    //Tasca 2.3, Mostrar la diferència màxima entre temperatures.
    public void mostrarDiferenciaMaxima(){


    }

    //Tasca 2.4. Finalitzar l'execució del programa (eixir del bucle).
    public void finalitzarExecucio(){

    }

    //NIVELL 3
    //Tasca 2.1.1. Lectura per teclat de les temperatures.
    public void llegirTemperatures(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("A continuació es soliciten les 7 temperatures d'esta setmana: ");
        for(int i = 0; i < DIES_SETMANA; i++){
            System.out.print("Introdueix la temperatura "+(i+1)+": ");
            while(!teclado.hasNextDouble()){
                teclado.nextLine();
                System.out.print("Error. Introdueix la temperatura "+(i+1)+": ");
            }
            temperatures[setmana][i] = teclado.nextDouble();
            teclado.nextLine();
        }
    }

    //Tasca 2.1.2. Actualització de la data actual.
    public void actualitzarData(){
        setmana++;
        for(int i=0;i<DIES_SETMANA;i++){
            if((dia==28 && mes==2) || (dia==30 && (mes==4 || mes==6 || mes==9 || mes==11)) || (dia==31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10))){
                dia=1;
                mes++;
            }
            else if(dia==31 && mes==12){
                dia=1;
                mes=1;
                setmana=0;
            }
            else{
                dia++;
            }
        }
    }

    //Tasca 2.2.1. y 2.3.1. Mostrar per pantalla la data actual
    public void mostrarDataActual(){
        String[] mesos = {"gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre"};
        
        System.out.println("Data actual: "+ dia + " de " + mesos[mes-1]);
    }

    //Tasca 2.2.2. Càlculs per a obtindre la mitjana de temperatures
    public void calcularTemperaturaMitjana(){
        int valors=0;
        double totals=0;
        for(int i=0; i<setmana; i++){
            for(int j=0; j<DIES_SETMANA; j++){
                valors++;
                totals+=temperatures[i][j];
            }
        }
        System.out.printf("La temperatura mitjana és de: %.2f ºC\n",(totals/valors));
    }

    //Tasca 2.3.2. Càlculs per a obtindre la diferència màxima entre temperatures
    public void calcularDiferenciaMaxima(){
        double minima = temperatures[0][0];
        double maxima = temperatures[0][0];

        for(int i=0; i<setmana; i++){
            for(int j=0; j<DIES_SETMANA; j++){
                if(temperatures[i][j] > maxima){
                    maxima = temperatures[i][j];
                }
                if(temperatures[i][j] < minima){
                    minima = temperatures[i][j];
                }
            }
        }

        System.out.printf("La diferència màxima entre temperatures és de %.2f ºC\n",(maxima-minima));

    }
}

