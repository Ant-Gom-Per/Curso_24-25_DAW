public class Practica37 {
    public static void main(String[] args) {
        int[][] distances = {
                { 0, 983, 787, 714, 1375, 967, 1087 },
                { 983, 0, 214, 1102, 1763, 1723, 1842 },
                { 787, 214, 0, 888, 1549, 1548, 1627 },
                { 714, 1102, 888, 0, 661, 781, 810 },
                { 1375, 1763, 1549, 661, 0, 1426, 1187 },
                { 967, 1723, 1548, 781, 1426, 0, 239 },
                { 1087, 1842, 1627, 810, 1187, 239, 0 },
        };
        String cities[] = {"Chicago", "Boston", "N.York", "Atlanta", "Miami", "Dallas", "Houston"};

        System.out.println("                          Distance Table (in milles)                       ");
        System.out.println("---------------------------------------------------------------------------");
        for(int i = 0; i < cities.length; i++){
            System.out.print("\t" + cities[i]);
        }
        System.out.println("\n---------------------------------------------------------------------------");

        for (int i = 0; i < distances.length; i++) {

            System.out.print(cities[i] + "\t");

            for (int j = 0; j < distances[i].length; j++) {
                System.out.print(distances[i][j] + "\t"); 
            }
            System.out.println();
        }

    }
}