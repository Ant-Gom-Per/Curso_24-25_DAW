import java.util.Scanner;
public class SetIMig {
    private Scanner teclat = new Scanner(System.in);
    public static void main(String[] args) {
        SetIMig programa = new SetIMig();
        programa.inici();
    }

    public void inici() {
        int[][] baralla = new int[4][10];
        double[] puntuacio;
        int jugadors = demanaJugadors();
        puntuacio = new double[jugadors];
        for (int i = 1; i <= jugadors; i++) {
            puntuacio[i-1] = jugar(baralla, i);
        }
        mostrarResultats(puntuacio);
        teclat.close();
    }

    public int demanaJugadors() {
        int resultat = 0;
        System.out.print("Introdueix el nombre de jugadors: ");
        while (!teclat.hasNextInt() || (resultat = teclat.nextInt()) < 2) {
            System.out.print("ERROR. Introdueix el nombre de jugadors: ");
            teclat.nextLine();
        }
        teclat.nextLine();
        return resultat;
    }

    public double jugar(int[][] baralla, int jugador) {
        boolean acabar = false;
        double punts = 0.0;
        System.out.println("\n-- TORN DEL JUGADOR " + jugador + " --\n");
        while (!acabar) {
            repartirCarta(baralla, jugador);
            punts = obtindrePunts(baralla, jugador);
            if (punts == 7.5) {
                System.out.println("Perfecte!!");
                acabar = true;
            } else if (punts > 7.5) {
                System.out.println("Ohhh! T'has passat :(");
                acabar = true;
            } else {
                acabar = etPlantes();
            }
        }
        return punts;
    }

    public void repartirCarta(int[][] baralla, int jugador) {
        int pal;
        int carta;
        do {
            pal = (int) (Math.random() * 4);
            carta = (int) (Math.random() * 10);
        } while (baralla[pal][carta] != 0);
        baralla[pal][carta] = jugador;
        mostrarCarta(pal, carta);
    }

    public void mostrarCarta(int pal, int carta) {
        String resultat = "Ha eixit: ";
        if (carta == 7)
            resultat += "Sota";
        else if (carta == 8)
            resultat += "Cavall";
        else if (carta == 9)
            resultat = "Rei";
        else
            resultat += (carta + 1);

        if (pal == 0)
            resultat += " d'Oros";
        else if (pal == 1)
            resultat += " d'Espases";
        else if (pal == 2)
            resultat += " de Bastos";
        else
            resultat += " de Copes";

        System.out.println(resultat);
    }

    public double obtindrePunts(int[][] baralla, int jugador) {
        double acumulador = 0.0;
        for (int i = 0; i < baralla.length; i++) {
            for (int j = 0; j < baralla[i].length; j++) {
                if (baralla[i][j] == jugador) {
                    if (j < 7)
                        acumulador += (j+1);
                    else
                        acumulador += 0.5;
                }
            }
        }
        return acumulador;
    }

    public boolean etPlantes(){
        String resposta;
        System.out.print("Et plantes? (s/n): ");
        resposta = teclat.nextLine();
        if(resposta.equalsIgnoreCase("s")){
            return true;
        }
        else return false;
    }

    public void mostrarResultats(double[] puntuacio){
        boolean empat = false;
        double maxima = 0.0;
        System.out.println("\n-- PUNTUACIÓ FINAL --");
        for(int i = 0; i < puntuacio.length; i++){
            System.out.print("Jugador " + (i+1) + ": ");
            if(puntuacio[i] > 7.5){
                System.out.print("S'HA PASSAT");
            } 
            else{
                System.out.print(puntuacio[i] + " punts.");
                if(puntuacio[i] > maxima){
                    maxima = puntuacio[i];
                    empat = false;
                }
                else if(puntuacio[i] == maxima){
                    empat = true;
                }
            }
            System.out.println();
            
        }
        if(maxima == 0.0){
            System.out.println("NO HI HA GUANYADOR");
        }
        else if(empat){
            System.out.println("HI HA JUGADORS EMPATATS. HAN GUANYAT: ");
        }
        else{
            System.out.println("EL JUGADOR GUANYADOR HA SIGUT: ");
        }

        for(int i=0; i<puntuacio.length; i++){
            if(puntuacio[i] == maxima) System.out.println("JUGADOR " + (i+1));
        }
    }

}
