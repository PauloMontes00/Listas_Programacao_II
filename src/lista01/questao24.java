package lista01;

import java.util.Arrays;
import java.util.Scanner;

public class questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");

        int n = sc.nextInt();
        int[] vetor = new int[n];

        System.out.println("Digite os elementos do vetor:");

        for(int i = 0; i < n; ++i) {
            vetor[i] = sc.nextInt();
        }

        boolean simetrico = true;

        for(int i = 0; i < n / 2; ++i) {
            if (vetor[i] != vetor[n - 1 - i]) {
                simetrico = false;
                break;
            }
        }
        if (simetrico) {
            System.out.println("O vetor é simétrico.");
            System.out.println(Arrays.toString(vetor));
        } else {
            System.out.println("O vetor NÃO é simétrico.");
            System.out.println(Arrays.toString(vetor));
        }
        sc.close();
    }
}
//Escreva um programa que verifique se um vetor é simétrico.