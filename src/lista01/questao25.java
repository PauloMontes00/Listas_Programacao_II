package lista01;

import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;
        System.out.println("preencha a matriz 3x3 para soma");

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                System.out.println("Digite o valor para posição [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }
        System.out.println("\nMatriz preenchida:");

        for(int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSoma de todos os elementos da matriz: " + soma);
        sc.close();
    }
}
// Gere a soma dos elementos de uma matriz 3x3.