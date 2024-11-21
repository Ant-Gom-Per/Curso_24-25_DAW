import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Metodes {
    public static void main(String[] args) {
        Metodes programa = new Metodes();
        programa.inici();
    }

    public void inici() {
        // System.out.println(aleatori(4,7));
        String[] dies = { "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge" };
        double[] valors = { 73.4, 32.1, 78.3, 35.9 };
        // System.out.println(aleatori(dies));
        // double[] ordenats = ordenarDoubles(valors);
        // System.out.println(Arrays.toString(ordenats));
        // String[] diesMesUn = afegir(dies, "Dillunge");
        // System.out.println(Arrays.toString(diesMesUn));
        // double[] meitat = segonaMeitat(valors);
        // System.out.println(Arrays.toString(meitat));
        // int[] aEmplenar = new int[10];
        // emplenar(aEmplenar);
        // System.out.println(Arrays.toString(aEmplenar));
        // System.out.println(substituir("cacau", "ca", "abe"));
        System.out.println(revertir("Benvingut",3));
        // System.out.println(toHex(14));
        // System.out.println(toDec("FF"));
        /* Boolean[] b1 = {true, false, false, true, true};
        Boolean[] b2 = {true, true, false, false, true};
        Boolean[] b3 = xor(b1, b2);
        System.out.println(Arrays.toString(b3)); */
        // System.out.println(maximComuDivisor(180,324));

    }

    public int aleatori(int n1, int n2) {
        Random random = new Random();
        if (random.nextBoolean()) {
            return n1;
        }
        return n2;
    }

    public String aleatori(String[] vector) {
        Random random = new Random();
        int indexAleatori = random.nextInt(vector.length);
        return vector[indexAleatori];
    }

    public double[] ordenarDoubles(double[] vector) {
        double[] copia = Arrays.copyOf(vector, vector.length);
        Arrays.sort(copia);
        return copia;
    }

    public String[] afegir(String[] original, String afegit) {
        String[] copia = Arrays.copyOf(original, original.length + 1);
        copia[copia.length - 1] = afegit;
        return copia;
    }

    public double[] segonaMeitat(double[] original) {
        return Arrays.copyOfRange(original, original.length / 2, original.length);
    }

    public void emplenar(int[] original) {
        Arrays.fill(original, 0, original.length / 2, 8);
        Arrays.fill(original, original.length / 2, original.length, 4);
    }

    public String eliminar(String original, char lletra) {
        StringBuilder sb = new StringBuilder(original);
        while (sb.indexOf(String.valueOf(lletra)) != -1) {
            sb.deleteCharAt(sb.indexOf(String.valueOf(lletra)));
        }
        return sb.toString();
    }

    public String substituir(String original, char vella, char nova) {
        StringBuilder sb = new StringBuilder(original);
        while (sb.indexOf(String.valueOf(vella)) != -1) {
            sb.setCharAt(sb.indexOf(String.valueOf(vella)), nova);
        }
        return sb.toString();
    }

    public String substituir(String original, String vella, String nova){
        StringBuilder sb = new StringBuilder(original);
        while(sb.indexOf(vella) != -1){
            sb = sb.replace(sb.indexOf(vella), sb.indexOf(vella)+vella.length(), nova);
        }
        return sb.toString();
    }

    public String revertir(String original, int index){
        StringBuilder resultat = new StringBuilder(original.substring(0, index));
        StringBuilder segonaPart = new StringBuilder(original.substring(index));
        resultat.append(segonaPart.reverse());
        return resultat.toString();
    }





    public String toHex(int numero){
        return Integer.toHexString(numero);
    }












    public Integer toDec(String numero){
        return Integer.valueOf(numero, 16);
    }





    
    public Boolean[] xor(Boolean[] array1, Boolean[] array2){
        Boolean[] resultat = new Boolean[array1.length];
        for(int i=0; i<array1.length; i++){
            resultat[i] = Boolean.logicalXor(array1[i], array2[i]);
        }
        return resultat;
    }

    public int maximComuDivisor(Integer n1, Integer n2){
        BigInteger bigN1 = new BigInteger(n1.toString());
        BigInteger bigN2 = new BigInteger(n2.toString());
        BigInteger mcd = bigN1.gcd(bigN2);
        return mcd.intValue();
    }

}