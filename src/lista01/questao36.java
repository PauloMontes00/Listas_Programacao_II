package lista01;

import java.util.Arrays;

public class questao36 {
    public static void main(String[] args) {
        int[] meuVetor = new int[]{7, 4, 10, 8, 2, 5};
        System.out.println("Vetor antes de ordenar: " + Arrays.toString(meuVetor));
        Arrays.sort(meuVetor);
        System.out.println("Vetor após ordenar: " + Arrays.toString(meuVetor));
    }
}
//Faça um programa para ordenar os valores de um vetor.