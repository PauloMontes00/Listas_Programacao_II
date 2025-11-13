package lista01;

import java.util.Scanner;

public class questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas do triângulo: ");

        int n = sc.nextInt();
        char[][] matriz = new char[n][n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if (j <= i) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        System.out.println("\nTriângulo de asteriscos:");

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
/**
 * Construa uma matriz de caracteres contendo um triângulo de asteriscos com base no número de linhas
 informado pelo usuário.
 **/