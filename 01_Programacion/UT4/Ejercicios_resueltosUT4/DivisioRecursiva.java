public class DivisioRecursiva {
    public static void main(String[] args) {
        DivisioRecursiva programa = new DivisioRecursiva();
        programa.inici();
    }

    public void inici(){
        System.out.println(divisio(16,3));
    }

    public int divisio(int dividend, int divisor){
        if(divisor > dividend) return 0;
        else return 1 + divisio(dividend-divisor, divisor);
    }
}
