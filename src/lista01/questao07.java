package lista01;

import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o limite máximo: ");
        int limite = sc.nextInt();

        System.out.println("Sequência de números quadrados até " + limite + ":");

        int i = 1;
        int quadrado = i * i;

        while (quadrado <= limite) {
            System.out.print(quadrado + " ");
            i++;
            quadrado = i * i;
        }

        sc.close();
    }
}
//Crie uma sequência de números quadrados (1, 4, 9, 16, ...) até um limite especificado pelo usuário.
