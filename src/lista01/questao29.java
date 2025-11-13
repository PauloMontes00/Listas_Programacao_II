package lista01;

import java.util.Scanner;

public class questao29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ordem n da matriz identidade: ");

        int n = sc.nextInt();
        int[][] I = new int[n][n];

        for(int i = 0; i < n; ++i) {
            I[i][i] = 1;
        }
        System.out.println("Matriz identidade " + n + "x" + n + ":");

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                System.out.print(I[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//Crie uma matriz identidade de ordem n.