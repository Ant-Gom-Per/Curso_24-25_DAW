package rombebuit;

import java.util.Scanner;

public class RombeBuit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix altura de la figura: ");
        int altura = teclat.nextInt();
        int meitat = (altura - 1) / 2;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (i <= meitat) {
                    if (j == meitat + i || j == meitat - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == meitat + (altura - 1 - i) || j == meitat - (altura - 1 - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
