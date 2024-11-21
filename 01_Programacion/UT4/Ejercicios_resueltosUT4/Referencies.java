public class Referencies{
    public static void main(String[] args){
        Referencies programa = new Referencies();
        programa.inici();
    }

    public void inici(){
        double[] temperatures = {12.6, 14.1, 10.8, 11.2};
        System.out.println(temperatures[2]);
        metode1(temperatures);
        System.out.println(temperatures[2]);


    }

    public void metode1(double[] temperatures){
        temperatures[0] = 6.3;
        temperatures[1] = 9.5;
        temperatures[2] = 11.7;
        temperatures[3] = 7.2;
    }

    public void metode2(double[] temperatures){
        temperatures = new double[]{6.3, 9.5, 11.7, 7.2};
       // Equivalent a:
       // temperatures = new double[4]; temperatures[0]=6.3; temperatures[1]=9.5 ...
    }

    public void metode3(double[] temperatures){
        double[] aux = new double[4];
        aux[0] = 6.3;
        aux[1] = 9.5;
        aux[2] = 11.7;
        aux[3] = 7.2;
        temperatures = aux;
    }

    public void metode4(double[] temperatures){
        temperatures = null;
    }



}