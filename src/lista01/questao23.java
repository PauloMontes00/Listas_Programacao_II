package lista01;

import java.util.Scanner;

public class questao23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma frase ou palavra qualquer");

        String texto = sc.nextLine();
        texto = texto.toLowerCase();
        int[] frequencia = new int[256];

        for(int i = 0; i < texto.length(); ++i) {
            char c = texto.charAt(i);
            if (c != ' ') {
                int var10002 = frequencia[c]++;
            }
        }
        System.out.println("\nFrequência dos caracteres:");

        for(int i = 0; i < frequencia.length; ++i) {
            if (frequencia[i] > 0) {
                System.out.println((char)i + " -> " + frequencia[i]);
            }
        }
        sc.close();
    }
}
// Escreva um programa que conte a frequência de cada caractere em uma string.