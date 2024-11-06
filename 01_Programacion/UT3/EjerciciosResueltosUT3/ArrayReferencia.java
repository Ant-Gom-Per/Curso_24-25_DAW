public class ArrayReferencia {
    public static void main(String[] args) {
        int[] vector1 = {8,7,8,9};
        int[] vector2 = {8,7,8,9};

        System.out.println("VECTOR 1: " + vector1);
        System.out.println("VECTOR 2: " + vector2);
        System.out.println("IGUALS? " + (vector1 == vector2));
        System.out.println();

        int[] vector3 = vector1;
        System.out.println("VECTOR 1: " + vector1);
        System.out.println("VECTOR 3: " + vector3);
        System.out.println("IGUALS? " + (vector1 == vector3));
        System.out.println();

        // ELS ARRAYS PODEN SER VARIABLES, I SEMPRE SÓN MUTABLES
        vector3 = vector2;
        vector3[2] = 10;
        System.out.println("VECTOR 1: " + vector1);
        System.out.println("VECTOR 2: " + vector2);
        System.out.println("VECTOR 3: " + vector3);
        System.out.println("VECTOR 3 [2]: " + vector3[2]);
        System.out.println();

        // ELS ARRAYS PODEN SER CONSTANTS, I SEMPRE SÓN MUTABLES
        final int[] VECTOR4 = {8,7,8,9};
        // VECTOR4 = vector1;
        VECTOR4[2] = 15;
        System.out.println("VECTOR 1: " + vector1);
        System.out.println("VECTOR 2: " + vector2);
        System.out.println("VECTOR 3: " + vector3);
        System.out.println("VECTOR 4: " + VECTOR4);
        System.out.println("VECTOR 4 [2]: " + VECTOR4[2]);

    }
}
