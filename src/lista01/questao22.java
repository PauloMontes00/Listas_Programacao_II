package lista01;

import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero para verificar se é palindromo");

        int num = sc.nextInt();
        String numeroString = Integer.toString(num);
        String numeroInvertido = (new StringBuilder(numeroString)).reverse().toString();

        if (numeroString.equals(numeroInvertido)) {
            System.out.println("O número " + num + " é um palíndromo.");
        } else {
            System.out.println("O número " + num + " não é um palíndromo.");
        }
    }
}
//Verifique se um número é palíndromo.