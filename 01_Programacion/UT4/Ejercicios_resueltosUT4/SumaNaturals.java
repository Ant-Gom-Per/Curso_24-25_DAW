public class SumaNaturals {

    public static void main(String[] args) {
        SumaNaturals programa = new SumaNaturals();
        programa.inici();
    }

    public void inici() {
        System.out.println(sumaNaturals(5));
    }

    public int sumaNaturals(int numero) {
        if (numero == 1) {
            return numero;
        } else {
            return numero + sumaNaturals(numero - 1);
        }

    }

}