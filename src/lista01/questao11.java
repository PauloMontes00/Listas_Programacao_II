package lista01;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma Lista de numeros para calcular a média");
        int lista = sc.nextInt();
        double soma = (double)0.0F;

        for(int i = 1; i <= lista; ++i) {
            System.out.print("Digite o " + i + "º número: ");
            double num = sc.nextDouble();
            soma += num;
        }
        double media = soma / (double)lista;
        System.out.println("A média dos números é: " + media);
        sc.close();
    }
}
// Calcule a média de uma lista de números inseridos pelo usuário.