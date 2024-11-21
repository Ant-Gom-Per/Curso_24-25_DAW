public class Recepta{
    public static void main(String[] args) {
        Recepta programa = new Recepta();
        programa.inici();
    }

    public void inici(){
        mostrarMaxim(7, 8);
    }

    public void imprimirRecepta(String aliment){
        System.out.println("Fregir " + aliment);
        System.out.println("- Preparar la paella per a fregir");
        System.out.println("- Agafar les " + aliment);
        System.out.println("- Rossejar les " + aliment);
        System.out.println("- Treure les " + aliment + " de la paella");
        System.out.println("- Deixar les " + aliment + " en un plat");
        System.out.println("- Netejar la paella");
    }

    public void imprimirAleatori(int minim, int maxim){
        int aleatori = (int)(Math.random() * (maxim-minim)) + minim;
        System.out.println(aleatori);
    }

    public void mostrarMaxim(int a, int b){
        if(a > b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}