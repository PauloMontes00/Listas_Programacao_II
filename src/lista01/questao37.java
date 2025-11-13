package lista01;

import java.io.PrintStream;

public class questao37 {
    public static boolean estaContido(int[] vetorMaior, int[] vetorMenor) {
        if (vetorMenor.length > vetorMaior.length) {
            return false;
        } else {
            for(int i = 0; i <= vetorMaior.length - vetorMenor.length; ++i) {
                boolean encontrado = true;

                for(int j = 0; j < vetorMenor.length; ++j) {
                    if (vetorMaior[i + j] != vetorMenor[j]) {
                        encontrado = false;
                        break;
                    }
                }
                if (encontrado) {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        int[] vetorA = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vetorB = new int[]{3, 4, 5};
        int[] vetorC = new int[]{7, 8, 9, 10};
        PrintStream var10000 = System.out;
        boolean var10001 = estaContido(vetorA, vetorB);
        var10000.println("Vetor B está contido em A? " + var10001);
        var10000 = System.out;
        var10001 = estaContido(vetorA, vetorC);
        var10000.println("Vetor C está contido em A? " + var10001);
    }
}
// Construa um programa que verifica se um vetor está contido no outro.