package lista01;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero para calcular o fatorial");

        int n = sc.nextInt();
        long fatorial = 1L;

        if (n != 0 && n != 1) {
            for(int i = 2; i <= n; ++i) {
                fatorial *= (long)i;
            }
        } else {
            fatorial = 1L;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        sc.close();
    }
}
//Calcule o fatorial de um número informado pelo usuário.
