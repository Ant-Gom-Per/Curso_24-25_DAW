public class DecToBin2 {
    public static void main(String[] args) {
        DecToBin2 programa = new DecToBin2();
        programa.inici();
    }
    public void inici() {
        System.out.println(decToBin(-17));
    }
    public String decToBin(int decimal){
        if (decimal <= 1 && decimal >= -1) {
            return String.valueOf(decimal);
        }
        return decToBin(decimal / 2) + String.valueOf(Math.abs(decimal) % 2);
    }
}
