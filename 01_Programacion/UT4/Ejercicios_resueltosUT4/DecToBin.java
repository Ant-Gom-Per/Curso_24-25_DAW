public class DecToBin {
    public static void main(String[] args) {
        DecToBin programa = new DecToBin();
        programa.inici();
    }
    public void inici() {
        System.out.println(decToBin(17));
    }
    public String decToBin(int decimal){
        if (decimal <= 1) {
            return String.valueOf(decimal);
        }
        return decToBin(decimal / 2) + String.valueOf(decimal % 2);
    }
}
